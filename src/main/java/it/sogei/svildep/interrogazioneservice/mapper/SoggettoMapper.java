package it.sogei.svildep.interrogazioneservice.mapper;

import it.sogei.svildep.interrogazioneservice.dto.SoggettoDto;
import it.sogei.svildep.interrogazioneservice.model.Soggetto;
import org.springframework.stereotype.Component;

@Component
public class SoggettoMapper implements Mapper<Soggetto, SoggettoDto> {

    @Override
    public SoggettoDto convertEntityToDtoImpl(Soggetto entity) {
        SoggettoDto dto = new SoggettoDto();
        dto.setNome(entity.getNome());
        dto.setCognome(entity.getCognome());
        dto.setCf(entity.getCf());
        dto.setPartitaIva(entity.getPartitaIva());
        return dto;
    }

    @Override
    public Soggetto convertDtoToEntityImpl(SoggettoDto dto) {
        Soggetto entity = new Soggetto();
        entity.setNome(dto.getNome());
        entity.setCognome(dto.getCognome());
        entity.setCf(dto.getCf());
        entity.setPartitaIva(dto.getPartitaIva());
       return entity;
    }
}
