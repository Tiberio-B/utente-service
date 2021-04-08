package it.sogei.svildep.utenteservice.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import it.sogei.svildep.utenteservice.dto.*;
import it.sogei.svildep.utenteservice.mapper.UtenteAbilitazioneMapper;
import it.sogei.svildep.utenteservice.repository.UtenteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import it.sogei.svildep.utenteservice.exception.Messages;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import it.sogei.svildep.utenteservice.mapper.InsertUtenteMapper;
import it.sogei.svildep.utenteservice.mapper.UtenteMapper;
import it.sogei.svildep.utenteservice.model.FlagSN;
import it.sogei.svildep.utenteservice.model.Utente;
import it.sogei.svildep.utenteservice.service.external.AnagrafeUnicaService;
import it.sogei.svildep.utenteservice.service.external.PortaleServiziDag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Service
@Getter
@RequiredArgsConstructor
public class UtenteService {
   
    private final PortaleServiziDag portaleServiziDag;
    private final UtenteRepository utenteRepository;
    private final UtenteMapper utenteMapper;
    private final InsertUtenteMapper insertUtenteMapper; 
    private final AnagrafeUnicaService anagrafeUnicaService;
    private final UtenteAbilitazioneMapper utenteAbilitazioneMapper;

    public List<UtenteDto> getAll() {
        return utenteMapper.mapEntityToDto(utenteRepository.findAll());
    }

    public UtenteDto get(Long id) {
        return utenteMapper.mapEntityToDto(utenteRepository.findById(id).orElse(null));
    }

    public MessageDto nuovaAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
       
        Utente utente = searchUtenteByCf((abilitazioneDto.getCodiceFiscale()));
        if(utente != null) {
			    if(!utente.getFlagAbilitazione().equals(FlagSN.N)) {
                    return new MessageDto(Messages.utenteGiaAbilitato, HttpStatus.BAD_REQUEST);
                }
                utente = utenteAbilitazioneMapper.mapDtoToEntity(abilitazioneDto, utente);
                utenteRepository.save(utente);

        }else {

            UtenteAnagraficaDto utenteAnagrafe = anagrafeUnicaService.searchUtenteByCf(abilitazioneDto.getCodiceFiscale());

        	if(utenteAnagrafe != null) {
                return new MessageDto(Messages.utenteInesistente, HttpStatus.OK);
        	}
            Utente utenteAnagrafeAbilitazione = new Utente();
            utenteAnagrafeAbilitazione = utenteAbilitazioneMapper.mapDtoToEntityImpl(abilitazioneDto,utenteAnagrafe);
            utenteRepository.save(utenteAnagrafeAbilitazione);
        }
        portaleServiziDag.comunicaAperturaAbilitazione(abilitazioneDto);
        return new MessageDto(Messages.nuovaAbilitazione, HttpStatus.OK);
    }


    public MessageDto chiudiAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
        Utente utente = utenteRepository.findById(Long.parseLong(abilitazioneDto.getUtenteId())).orElseThrow(
                () -> new SvildepException(Messages.utenteInesistente, HttpStatus.BAD_REQUEST)
        );
        utente.setDataFine(LocalDate.parse(abilitazioneDto.getDataFineValidita()));
        utenteRepository.save(utente);
        portaleServiziDag.comunicaChiusuraAbilitazione(abilitazioneDto);
        return new MessageDto(Messages.chiusuraAbilitazione, HttpStatus.OK);
    }

    public MessageDto modificaAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
        chiudiAbilitazione(abilitazioneDto);
        nuovaAbilitazione(abilitazioneDto);
        return new MessageDto(Messages.modificaAbilitazione, HttpStatus.OK);
    }

    public Utente searchUtenteByCf(String codiceFiscale) {

        return utenteRepository.findUtenteByCodiceFiscale(codiceFiscale);
    }

    public MessageDto insertUtente(UtenteInsertDto utenteInsertDto) throws SvildepException {
    	 utenteRepository.save(insertUtenteMapper.mapDtoToEntity(utenteInsertDto));
        return new MessageDto(Messages.nuovaAbilitazione, HttpStatus.OK);
    }
    //    public List<UtenteDto> search(UtenteDto utenteDto) throws SvildepException {
//    	return utenteMapper.mapEntityToDto(utenteRepository.findUtente(utenteDto));
//    }
    

	
	
}

