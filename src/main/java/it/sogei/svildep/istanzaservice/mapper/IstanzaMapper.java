package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import org.springframework.stereotype.Component;

@Component
public class IstanzaMapper extends Mapper<Istanza, IstanzaDto> {
    @Override
    public IstanzaDto convertEntityToDtoImpl(Istanza entity) {
        return null;
    }

    @Override
    public Istanza convertDtoToEntityImpl(IstanzaDto dto) {
        return null;
    }
}
