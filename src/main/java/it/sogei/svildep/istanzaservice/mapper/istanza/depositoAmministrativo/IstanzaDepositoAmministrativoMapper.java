package it.sogei.svildep.istanzaservice.mapper.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaMapper;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.IstanzaDepositoAmministrativo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IstanzaDepositoAmministrativoMapper extends IstanzaMapper<IstanzaDepositoAmministrativo, IstanzaDepositoAmministrativoDto> {

    private final OperaMapper operaMapper;
    private final BeneMapper beneMapper;

    @Override
    public IstanzaDepositoAmministrativoDto convertEntityToDtoImpl(IstanzaDepositoAmministrativo entity) {
        IstanzaDepositoAmministrativoDto dto = new IstanzaDepositoAmministrativoDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        dto.setDepositante(getSoggettoMapper().convertEntityToDto(entity.getDepositante()));
        dto.setAutoritaEspropriante(getSoggettoMapper().convertEntityToDto(entity.getAutoritaEspropriante()));
        dto.setDatiOpera(operaMapper.convertEntityToDto(entity.getDatiOpera()));
        dto.setBeneEspropriato(beneMapper.convertEntityToDto(entity.getBeneEspropriato()));
        return dto;
    }

    @Override
    public IstanzaDepositoAmministrativo convertDtoToEntityImpl(IstanzaDepositoAmministrativoDto dto) {
        IstanzaDepositoAmministrativo entity = new IstanzaDepositoAmministrativo();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        entity.setDepositante(getSoggettoMapper().convertDtoToEntity(dto.getDepositante()));
        entity.setAutoritaEspropriante(getSoggettoMapper().convertDtoToEntity(dto.getAutoritaEspropriante()));
        entity.setDatiOpera(operaMapper.convertDtoToEntity(dto.getDatiOpera()));
        entity.setBeneEspropriato(beneMapper.convertDtoToEntity(dto.getBeneEspropriato()));
        return entity;
    }
}
