package it.sogei.svildep.istanzaservice.mapper;

import it.sogei.svildep.istanzaservice.dto.OperaDto;
import it.sogei.svildep.istanzaservice.model.geo.Regione;
import it.sogei.svildep.istanzaservice.model.Opera;
import org.springframework.stereotype.Component;

@Component
public class OperaMapper implements Mapper<Opera, OperaDto> {

    @Override
    public OperaDto convertEntityToDtoImpl(Opera entity) {
        OperaDto dto = new OperaDto();
        dto.setDescrizione(entity.getDescrizione());
        dto.setRegione(entity.getRegione().name());
        return dto;
    }

    @Override
    public Opera convertDtoToEntityImpl(OperaDto dto) {
        Opera entity = new Opera();
        entity.setDescrizione(dto.getDescrizione());
        entity.setRegione(Regione.valueOf(dto.getRegione()));
        return entity;
    }
}
