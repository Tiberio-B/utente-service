package it.sogei.svildep.utenteservice.mapper;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.model.Utente;
import lombok.NoArgsConstructor;

@Component
@Primary
@NoArgsConstructor
public class UtenteMapper implements Mapper<Utente, UtenteDto> {

    @Override
    public Utente mapDtoToEntityImpl(UtenteDto dto) throws RuntimeException {
        Utente entity = new Utente();
        return entity;
    }

    @Override
    public UtenteDto mapEntityToDtoImpl(Utente entity) {
        UtenteDto dto = new UtenteDto();
        return dto;
    }
    

}

