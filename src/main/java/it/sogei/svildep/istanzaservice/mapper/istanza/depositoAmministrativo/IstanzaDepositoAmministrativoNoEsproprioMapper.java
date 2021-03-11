package it.sogei.svildep.istanzaservice.mapper.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoNoEsproprioDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaMapper;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoNoEsproprio;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepositoAmministrativoNoEsproprioMapper extends IstanzaMapper<IstanzaDepositoAmministrativoNoEsproprio, IstanzaDepositoAmministrativoNoEsproprioDto> {

    @Override
    public IstanzaDepositoAmministrativoNoEsproprioDto convertEntityToDtoImpl(IstanzaDepositoAmministrativoNoEsproprio entity) {
        IstanzaDepositoAmministrativoNoEsproprioDto dto = new IstanzaDepositoAmministrativoNoEsproprioDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        dto.setVersante(getSoggettoMapper().convertEntityToDto(entity.getVersante()));
        dto.setUlterioreSoggetto(getSoggettoMapper().convertEntityToDto(entity.getUlterioreSoggetto()));
        return dto;
    }

    @Override
    public IstanzaDepositoAmministrativoNoEsproprio convertDtoToEntityImpl(IstanzaDepositoAmministrativoNoEsproprioDto dto) {
        IstanzaDepositoAmministrativoNoEsproprio entity = new IstanzaDepositoAmministrativoNoEsproprio();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        entity.setVersante(getSoggettoMapper().convertDtoToEntity(dto.getVersante()));
        entity.setUlterioreSoggetto(getSoggettoMapper().convertDtoToEntity(dto.getUlterioreSoggetto()));
        return entity;
    }
}
