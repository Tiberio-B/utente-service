package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.RestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.model.istanza.RestituzioneDeposito;
import org.springframework.stereotype.Component;

@Component
public class RestituzioneDepositoMapper extends IstanzaMapper<RestituzioneDeposito, RestituzioneDepositoDto> {

    @Override
    public RestituzioneDepositoDto convertEntityToDtoImpl(RestituzioneDeposito entity) {
        RestituzioneDepositoDto dto = new RestituzioneDepositoDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        return dto;
    }

    @Override
    public RestituzioneDeposito convertDtoToEntityImpl(RestituzioneDepositoDto dto) {
        RestituzioneDeposito entity = new RestituzioneDeposito();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        return entity;
    }
}
