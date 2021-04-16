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


        return Utente.builder().id(Long.parseLong(dto.getId())).codiceFiscale(dto.getCodiceFiscale()).nome(dto.getNome()).cognome(dto.getCognome()).
                flagAbilitazione(FlagSN.valueOf(dto.getAbilitato())).dataInizio(LocalDate.parse(dto.getDataInizioValidita())).
                dataFine(LocalDate.parse(dto.getDataFineValidita())).
                ruolo(Ruolo.builder().id(Long.parseLong(dto.getRuoloId())).build()).
                rts(Rts.builder().id(Long.parseLong(dto.getRtsId())).build()).build();


    }

    @Override
    public UtenteDto mapEntityToDtoImpl(Utente entity) {
        return UtenteDto.builder().id(String.valueOf(entity.getId())).codiceFiscale(entity.getCodiceFiscale()).nome(entity.getNome()).
                cognome(entity.getNome()).abilitato(String.valueOf(entity.getFlagAbilitazione())).
                ruoloId(String.valueOf(entity.getRuolo().getId())).rtsId(String.valueOf(entity.getRts().getId())).build();

    }


}

