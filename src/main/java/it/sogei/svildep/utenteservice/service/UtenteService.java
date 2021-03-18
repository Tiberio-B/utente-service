package it.sogei.svildep.utenteservice.service;

import it.sogei.svildep.utenteservice.dto.AbilitazioneDto;
import it.sogei.svildep.utenteservice.dto.MessageDto;
import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.exception.Messages;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import it.sogei.svildep.utenteservice.service.external.PortaleServiziDag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static it.sogei.svildep.utenteservice.MockDataLoader.databaseUtente;

@Service
@Getter
@RequiredArgsConstructor
public class UtenteService {

    private final PortaleServiziDag portaleServiziDag;

    public List<UtenteDto> getAll() { return new ArrayList<>(databaseUtente.values()); }

    public UtenteDto get(String id) { return databaseUtente.get(id); }

    public List<UtenteDto> search(UtenteDto ricercaDto) {
        List<UtenteDto> found = new ArrayList<>();
        for (UtenteDto utente : databaseUtente.values()) {
            if (utente.equals(ricercaDto)) found.add(utente);
        }
        return found;
    }

    public void update(UtenteDto utenteDto) { databaseUtente.put(utenteDto.getId(), utenteDto); }

    public MessageDto nuovaAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
        UtenteDto utente = get(abilitazioneDto.getUtenteId());
        // if (utenteRepository.findByDataInizioValiditaBeforeAndDataFineValiditaIsNullOrAfter(Date.NOW, Date.NOW)) throw new SvildepException(Messages.abilitazioneUtenteAperta)
        portaleServiziDag.comunicaAperturaAbilitazione(abilitazioneDto);
        update(utente);
        return new MessageDto(Messages.nuovaAbilitazione, HttpStatus.OK);
    }

    public MessageDto chiudiAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
        UtenteDto utente = get(abilitazioneDto.getUtenteId());
        utente.setDataFineValidita(abilitazioneDto.getDataFineValidita());
        update(utente);
        return portaleServiziDag.comunicaChiusuraAbilitazione(abilitazioneDto);
    }

    public MessageDto modificaAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
        chiudiAbilitazione(abilitazioneDto);
        return nuovaAbilitazione(abilitazioneDto);
    }
}
