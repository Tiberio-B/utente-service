package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoNoEsproprioDto;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoAmministrativoNoEsproprio;
import org.springframework.stereotype.Component;

@Component
public class DepositoAmministrativoNoEsproprioMapper extends IstanzaMapper<DepositoAmministrativoNoEsproprio, DepositoAmministrativoNoEsproprioDto> {

    @Override
    public DepositoAmministrativoNoEsproprioDto convertEntityToDtoImpl(DepositoAmministrativoNoEsproprio entity) {
        DepositoAmministrativoNoEsproprioDto dto = new DepositoAmministrativoNoEsproprioDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        dto.setVersante(getSoggettoMapper().convertEntityToDto(entity.getVersante()));
        dto.setUlterioreSoggetto(getSoggettoMapper().convertEntityToDto(entity.getUlterioreSoggetto()));
        return dto;
    }

    @Override
    public DepositoAmministrativoNoEsproprio convertDtoToEntityImpl(DepositoAmministrativoNoEsproprioDto dto) {
        DepositoAmministrativoNoEsproprio entity = new DepositoAmministrativoNoEsproprio();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        entity.setVersante(getSoggettoMapper().convertDtoToEntity(dto.getVersante()));
        entity.setUlterioreSoggetto(getSoggettoMapper().convertDtoToEntity(dto.getUlterioreSoggetto()));
        return entity;
    }
}
