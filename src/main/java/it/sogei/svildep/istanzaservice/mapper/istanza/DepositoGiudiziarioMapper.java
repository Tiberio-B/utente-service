package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoGiudiziario;
import org.springframework.stereotype.Component;

@Component
public class DepositoGiudiziarioMapper extends IstanzaMapper<DepositoGiudiziario, DepositoGiudiziarioDto> {

    @Override
    public DepositoGiudiziarioDto convertEntityToDtoImpl(DepositoGiudiziario entity) {
        DepositoGiudiziarioDto dto = new DepositoGiudiziarioDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        dto.setVersante(getSoggettoMapper().convertEntityToDto(entity.getVersante()));
        dto.setAutoritaOrdinante(getSoggettoMapper().convertEntityToDto(entity.getAutoritaOrdinante()));
        dto.setSoggettoUlteriore(getSoggettoMapper().convertEntityToDto(entity.getSoggettoUlteriore()));
        return dto;
    }

    @Override
    public DepositoGiudiziario convertDtoToEntityImpl(DepositoGiudiziarioDto dto) {
        DepositoGiudiziario entity = new DepositoGiudiziario();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        entity.setVersante(getSoggettoMapper().convertDtoToEntity(dto.getVersante()));
        entity.setAutoritaOrdinante(getSoggettoMapper().convertDtoToEntity(dto.getAutoritaOrdinante()));
        entity.setSoggettoUlteriore(getSoggettoMapper().convertDtoToEntity(dto.getSoggettoUlteriore()));
        return entity;
    }
}
