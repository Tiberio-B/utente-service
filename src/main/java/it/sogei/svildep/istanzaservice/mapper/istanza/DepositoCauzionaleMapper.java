package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoCauzionaleDto;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoCauzionale;
import org.springframework.stereotype.Component;

@Component
public class DepositoCauzionaleMapper extends IstanzaMapper<DepositoCauzionale, DepositoCauzionaleDto> {

    @Override
    public DepositoCauzionaleDto convertEntityToDtoImpl(DepositoCauzionale entity) {
        DepositoCauzionaleDto dto = new DepositoCauzionaleDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        dto.setProprietario(super.getSoggettoMapper().convertEntityToDto(entity.getProprietario()));
        dto.setEnteRichiedente(super.getSoggettoMapper().convertEntityToDto(entity.getEnteRichiedente()));
        dto.setProprietario(getSoggettoMapper().convertEntityToDto(entity.getProprietario()));
        dto.setEnteRichiedente(getSoggettoMapper().convertEntityToDto(entity.getEnteRichiedente()));
        return dto;
    }

    @Override
    public DepositoCauzionale convertDtoToEntityImpl(DepositoCauzionaleDto dto) {
        DepositoCauzionale entity = new DepositoCauzionale();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        entity.setProprietario(super.getSoggettoMapper().convertDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(super.getSoggettoMapper().convertDtoToEntity(dto.getEnteRichiedente()));
        entity.setProprietario(getSoggettoMapper().convertDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(getSoggettoMapper().convertDtoToEntity(dto.getEnteRichiedente()));
        return entity;
    }
}
