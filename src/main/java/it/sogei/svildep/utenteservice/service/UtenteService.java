package it.sogei.svildep.utenteservice.service;

import it.sogei.svildep.utenteservice.dto.*;
import it.sogei.svildep.utenteservice.exception.Messages;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import it.sogei.svildep.utenteservice.mapper.UtenteAbilitazioneMapper;
import it.sogei.svildep.utenteservice.mapper.UtenteMapper;
import it.sogei.svildep.utenteservice.model.Rts;
import it.sogei.svildep.utenteservice.model.Ruolo;
import it.sogei.svildep.utenteservice.model.Utente;
import it.sogei.svildep.utenteservice.model.enums.FlagSN;
import it.sogei.svildep.utenteservice.repository.RtsRepository;
import it.sogei.svildep.utenteservice.repository.RuoloRepository;
import it.sogei.svildep.utenteservice.repository.UtenteRepository;
import it.sogei.svildep.utenteservice.service.external.AnagrafeUnicaAdapter;
import it.sogei.svildep.utenteservice.service.external.PortaleServiziDag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
@Getter
@RequiredArgsConstructor
public class UtenteService {
   
    private final PortaleServiziDag portaleServiziDag;
    private final UtenteRepository utenteRepository;
    private final RuoloRepository ruoloRepository;
    private final RtsRepository rtsRepository;
    private final UtenteMapper utenteMapper;
    private final AnagrafeUnicaAdapter anagrafeUnicaAdapter;
    private final UtenteAbilitazioneMapper utenteAbilitazioneMapper;

    private static String ADMIN_ROLE = "AMMINISTRATORE";
    private static String OPERATORE_RTS = "OPERATORE_RTS";
    private static String DIRETTORE_RTS = "DIRETTORE_RTS";

    public List<UtenteDto> getAll() { return utenteMapper.mapEntityToDto(utenteRepository.findAll()); }

    public UtenteDto get(Long id) {
        return utenteMapper.mapEntityToDto(utenteRepository.findById(id).orElse(null));
    }

    public MessageDto nuovaAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
       
        Utente utente = getUtenteDaCf((abilitazioneDto.getCodiceFiscale()));
        if (utente != null) {
            if (utente.getFlagAbilitazione().equals(FlagSN.S)) {
                return new MessageDto(Messages.utenteGiaAbilitato, HttpStatus.BAD_REQUEST);
            }
            if (utente.getDataFine() != null) {
                return new MessageDto(Messages.nonAbilitabile, HttpStatus.BAD_REQUEST);
            }
            utenteRepository.save(utenteAbilitazioneMapper.mapDtoToEntity(abilitazioneDto, utente));
        } else {

            UtenteAnagraficaDto utenteAnagrafe = anagrafeUnicaAdapter.searchUtenteByCf(abilitazioneDto.getCodiceFiscale());

        	if (utenteAnagrafe == null) {
                return new MessageDto(Messages.utenteInesistente, HttpStatus.OK);
        	}
            utenteRepository.save(utenteAbilitazioneMapper.mapDtoToEntityImpl(abilitazioneDto,utenteAnagrafe));
        }
        portaleServiziDag.comunicaAperturaAbilitazione(abilitazioneDto);
        return new MessageDto(Messages.nuovaAbilitazione, HttpStatus.OK);
    }

   public MessageDto chiudiAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
        Utente utente = utenteRepository.findById(Long.parseLong(abilitazioneDto.getUtenteId()))
                .orElseThrow(() -> new SvildepException(Messages.utenteInesistente, HttpStatus.BAD_REQUEST));
        utente.setDataFine(LocalDate.parse(abilitazioneDto.getDataFineValidita()));
        utente.setFlagAbilitazione(FlagSN.N);
        utenteRepository.save(utente);
        portaleServiziDag.comunicaChiusuraAbilitazione(abilitazioneDto);
        return new MessageDto(Messages.chiusuraAbilitazione, HttpStatus.OK);
    }

    public MessageDto modificaAbilitazione(ModificaAbilitazioneDto modificaAbilitazioneDto) throws SvildepException {
        Utente utente = utenteRepository.findById(Long.parseLong(modificaAbilitazioneDto.getUtenteId()))
                .orElseThrow(() -> new SvildepException(Messages.utenteInesistente, HttpStatus.BAD_REQUEST));
        Ruolo ruolo = null;
        if (StringUtils.isNotBlank(modificaAbilitazioneDto.getRuoloId())) {
            ruolo = ruoloRepository.findById(Long.parseLong(modificaAbilitazioneDto.getRuoloId())).orElse(null);
            if (ruolo != null) {
                if (ruolo.getDescrizione().equals(ADMIN_ROLE)) {
                    return new MessageDto(Messages.modificaNegata, HttpStatus.BAD_REQUEST);
                }
            }
        }

        Ruolo ruoloDaDb = ruoloRepository.findById(utente.getRuolo().getId())
                .orElseThrow(() -> new SvildepException("TO-DO ERRORE"));
        if (ruoloDaDb.getDescrizione().equals(ADMIN_ROLE)) {
            return new MessageDto(Messages.modificaNegata, HttpStatus.BAD_REQUEST);
        }
        if (ruolo == null) {
            ruolo = ruoloDaDb;
        }
        utente.setRuolo(ruolo);

        if ((ruolo.getDescrizione().equals(OPERATORE_RTS) || ruolo.getDescrizione().equals(DIRETTORE_RTS))
           && StringUtils.isNotBlank(modificaAbilitazioneDto.getRtsId())){
           Rts rts = rtsRepository.findById(Long.parseLong(modificaAbilitazioneDto.getRtsId())).orElse(null);
            utente.setRts(rts);
        }

        utenteRepository.save(utente);
        return new MessageDto(Messages.modificaAbilitazione, HttpStatus.OK);

    }

    private Utente getUtenteDaCf(String codiceFiscale) {
        return utenteRepository.findUtenteByCodiceFiscale(codiceFiscale).orElse(null);
    }
	
}

