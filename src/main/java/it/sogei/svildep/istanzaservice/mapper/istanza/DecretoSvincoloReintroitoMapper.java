package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DecretoSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.model.istanza.DecretoSvincoloReintroito;
import org.springframework.stereotype.Component;

@Component
public class DecretoSvincoloReintroitoMapper extends IstanzaMapper<DecretoSvincoloReintroito, DecretoSvincoloReintroitoDto> {

    @Override
    public DecretoSvincoloReintroitoDto convertEntityToDtoImpl(DecretoSvincoloReintroito entity) {
        DecretoSvincoloReintroitoDto dto = new DecretoSvincoloReintroitoDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        return dto;
    }

    @Override
    public DecretoSvincoloReintroito convertDtoToEntityImpl(DecretoSvincoloReintroitoDto dto) {
        DecretoSvincoloReintroito entity = new DecretoSvincoloReintroito();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        return entity;
    }
}
