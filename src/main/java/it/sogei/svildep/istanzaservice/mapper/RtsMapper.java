package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.RtsDto;
import it.sogei.svildep.istanzaservice.model.Rts;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class RtsMapper implements Mapper<Rts, RtsDto> {

    @Override
    public RtsDto convertEntityToDtoImpl(Rts entity) {
        RtsDto dto = new RtsDto();
        return dto;
    }

    @Override
    public Rts convertDtoToEntityImpl(RtsDto dto) {
        Rts entity = new Rts();
        return entity;
    }
}
