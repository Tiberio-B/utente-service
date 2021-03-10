package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoVolontario;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepositoVolontarioMapper extends IstanzaMapper<IstanzaDepositoVolontario, IstanzaDepositoVolontarioDto> {

    @Override
    public IstanzaDepositoVolontarioDto convertEntityToDtoImpl(IstanzaDepositoVolontario entity) {
        IstanzaDepositoVolontarioDto dto = new IstanzaDepositoVolontarioDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        return dto;
    }

    @Override
    public IstanzaDepositoVolontario convertDtoToEntityImpl(IstanzaDepositoVolontarioDto dto) {
        IstanzaDepositoVolontario entity = new IstanzaDepositoVolontario();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        return entity;
    }
}
