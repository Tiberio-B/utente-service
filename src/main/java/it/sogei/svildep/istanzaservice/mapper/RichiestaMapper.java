package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.RichiestaDto;
import it.sogei.svildep.istanzaservice.model.Richiesta;
import org.springframework.stereotype.Component;
import org.springframework.util.NumberUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class RichiestaMapper implements Mapper<Richiesta, RichiestaDto> {

    @Override
    public RichiestaDto convertEntityToDtoImpl(Richiesta entity) {
        RichiestaDto dto = new RichiestaDto();
        dto.setData(entity.getData().toString());
        return dto;
    }

    @Override
    public Richiesta convertDtoToEntityImpl(RichiestaDto dto) {
        Richiesta entity = new Richiesta();
        entity.setData(LocalDateTime.parse(dto.getData()));
        return entity;
    }
}
