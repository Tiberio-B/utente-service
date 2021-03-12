package it.sogei.svildep.interrogazioneservice.mapper;

import it.sogei.svildep.interrogazioneservice.dto.RtsDto;
import it.sogei.svildep.interrogazioneservice.model.Rts;
import org.springframework.stereotype.Component;

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
