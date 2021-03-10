package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.mapper.DepositoMapper;
import it.sogei.svildep.istanzaservice.mapper.Mapper;
import it.sogei.svildep.istanzaservice.mapper.SoggettoMapper;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public abstract class IstanzaMapper<I extends Istanza, D extends IstanzaDto> implements Mapper<I, D> {

    @Autowired
    @Getter
    private SoggettoMapper soggettoMapper;
    @Autowired
    private DepositoMapper depositoMapper;

    public void mapPropertyIstanzaEntityToDto(Istanza entity, IstanzaDto dto) {
        dto.setRichiedente(soggettoMapper.convertEntityToDto(entity.getRichiedente()));
        dto.setDatiDeposito(depositoMapper.convertEntityToDto(entity.getDatiDeposito()));
    }

    public void mapPropertyIstanzaDtoToEntity(IstanzaDto dto, Istanza entity) {
        entity.setRichiedente(soggettoMapper.convertDtoToEntity(dto.getRichiedente()));
        entity.setDatiDeposito(depositoMapper.convertDtoToEntity(dto.getDatiDeposito()));
    }
}
