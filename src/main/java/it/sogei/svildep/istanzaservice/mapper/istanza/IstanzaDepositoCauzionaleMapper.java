package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDepositoCauzionaleDto;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoCauzionale;
import org.springframework.stereotype.Component;

@Component
public class IstanzaDepositoCauzionaleMapper extends IstanzaMapper<IstanzaDepositoCauzionale, IstanzaDepositoCauzionaleDto> {

    @Override
    public IstanzaDepositoCauzionaleDto convertEntityToDtoImpl(IstanzaDepositoCauzionale entity) {
        IstanzaDepositoCauzionaleDto dto = new IstanzaDepositoCauzionaleDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        dto.setProprietario(super.getSoggettoMapper().convertEntityToDto(entity.getProprietario()));
        dto.setEnteRichiedente(super.getSoggettoMapper().convertEntityToDto(entity.getEnteRichiedente()));
        dto.setProprietario(getSoggettoMapper().convertEntityToDto(entity.getProprietario()));
        dto.setEnteRichiedente(getSoggettoMapper().convertEntityToDto(entity.getEnteRichiedente()));
        return dto;
    }

    @Override
    public IstanzaDepositoCauzionale convertDtoToEntityImpl(IstanzaDepositoCauzionaleDto dto) {
        IstanzaDepositoCauzionale entity = new IstanzaDepositoCauzionale();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        entity.setProprietario(super.getSoggettoMapper().convertDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(super.getSoggettoMapper().convertDtoToEntity(dto.getEnteRichiedente()));
        entity.setProprietario(getSoggettoMapper().convertDtoToEntity(dto.getProprietario()));
        entity.setEnteRichiedente(getSoggettoMapper().convertDtoToEntity(dto.getEnteRichiedente()));
        return entity;
    }
}
