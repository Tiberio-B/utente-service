package it.sogei.svildep.istanzaservice.mapper.istanza.geo;

import it.sogei.svildep.istanzaservice.dto.geo.ComuneDto;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import it.sogei.svildep.istanzaservice.model.geo.Comune;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ComuneMapper implements Mapper<Comune, ComuneDto> {

    @Override
    public ComuneDto convertEntityToDtoImpl(Comune entity) {
        ComuneDto dto = new ComuneDto();
        dto.setNome(entity.getNome());
        return dto;
    }

    @Override
    public Comune convertDtoToEntityImpl(ComuneDto dto) {
        Comune entity = new Comune();
        entity.setNome(dto.getNome());
        return entity;
    }
}
