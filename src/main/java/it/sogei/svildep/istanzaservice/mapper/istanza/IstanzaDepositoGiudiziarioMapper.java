package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoGiudiziario;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepositoGiudiziarioMapper extends IstanzaMapper<IstanzaDepositoGiudiziario, IstanzaDepositoGiudiziarioDto> {

    @Override
    public IstanzaDepositoGiudiziarioDto convertEntityToDtoImpl(IstanzaDepositoGiudiziario entity) {
        IstanzaDepositoGiudiziarioDto dto = new IstanzaDepositoGiudiziarioDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        return dto;
    }

    @Override
    public IstanzaDepositoGiudiziario convertDtoToEntityImpl(IstanzaDepositoGiudiziarioDto dto) {
        IstanzaDepositoGiudiziario entity = new IstanzaDepositoGiudiziario();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        return entity;
    }
}
