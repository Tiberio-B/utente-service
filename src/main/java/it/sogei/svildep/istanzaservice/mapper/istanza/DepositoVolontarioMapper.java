package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoVolontario;
import org.springframework.stereotype.Component;

@Component
public class DepositoVolontarioMapper extends IstanzaMapper<DepositoVolontario, DepositoVolontarioDto> {

    @Override
    public DepositoVolontarioDto convertEntityToDtoImpl(DepositoVolontario entity) {
        DepositoVolontarioDto dto = new DepositoVolontarioDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        return dto;
    }

    @Override
    public DepositoVolontario convertDtoToEntityImpl(DepositoVolontarioDto dto) {
        DepositoVolontario entity = new DepositoVolontario();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        return entity;
    }
}
