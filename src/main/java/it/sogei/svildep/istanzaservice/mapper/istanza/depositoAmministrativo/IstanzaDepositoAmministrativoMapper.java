package it.sogei.svildep.istanzaservice.mapper.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaMapper;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.IstanzaDepositoAmministrativo;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepositoAmministrativoMapper extends IstanzaMapper<IstanzaDepositoAmministrativo, IstanzaDepositoAmministrativoDto> {

    @Override
    public IstanzaDepositoAmministrativoDto convertEntityToDtoImpl(IstanzaDepositoAmministrativo entity) {
        IstanzaDepositoAmministrativoDto dto = new IstanzaDepositoAmministrativoDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        return dto;
    }

    @Override
    public IstanzaDepositoAmministrativo convertDtoToEntityImpl(IstanzaDepositoAmministrativoDto dto) {
        IstanzaDepositoAmministrativo entity = new IstanzaDepositoAmministrativo();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        return entity;
    }
}
