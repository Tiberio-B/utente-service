package it.sogei.svildep.utenteservice.mapper;


import it.sogei.svildep.utenteservice.model.Rts;
import it.sogei.svildep.utenteservice.model.Ruolo;
import it.sogei.svildep.utenteservice.model.enums.FlagSN;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.model.Utente;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Component
@Primary
@NoArgsConstructor
public class UtenteMapper implements Mapper<Utente, UtenteDto> {

    @Override
    public Utente mapDtoToEntityImpl(UtenteDto dto) throws RuntimeException {
        Utente utente = new Utente();
        utente.setId(Long.parseLong(dto.getId()));
        utente.setCodiceFiscale(dto.getCf());
        utente.setNome(dto.getNome());
        utente.setCognome(dto.getCognome());
        utente.setFlagAbilitazione(FlagSN.valueOf(dto.getAbilitato()));
        utente.setDataInizio(LocalDate.parse(dto.getDataInizioValidita()));
        utente.setDataFine(LocalDate.parse(dto.getDataFineValidita()));
        Ruolo ruolo = new Ruolo();

        ruolo.setId(Long.parseLong(dto.getRuoloId()));
        utente.setRuolo(ruolo);

        Rts rts = new Rts();
        rts.setId(Long.parseLong(dto.getRtsId()));
        utente.setRts(rts);
        return utente;
    }

    @Override
    public UtenteDto mapEntityToDtoImpl(Utente entity) {
        UtenteDto dto = new UtenteDto();
        dto.setId(String.valueOf(entity.getId()));
        dto.setCf(entity.getCodiceFiscale());
        dto.setNome(entity.getNome());
        dto.setCognome(entity.getCognome());
        dto.setAbilitato(String.valueOf(entity.getFlagAbilitazione()));

        dto.setRuoloId(String.valueOf(entity.getRuolo().getId()));

        dto.setRtsId(String.valueOf(entity.getRts().getId()));
        return dto;
    }
    

}

