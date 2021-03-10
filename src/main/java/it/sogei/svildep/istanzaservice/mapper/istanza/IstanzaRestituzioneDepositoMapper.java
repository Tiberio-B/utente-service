package it.sogei.svildep.istanzaservice.mapper.istanza;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaRestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaRestituzioneDeposito;
import org.springframework.stereotype.Component;

@Component
public class IstanzaRestituzioneDepositoMapper extends IstanzaMapper<IstanzaRestituzioneDeposito, IstanzaRestituzioneDepositoDto> {

    @Override
    public IstanzaRestituzioneDepositoDto convertEntityToDtoImpl(IstanzaRestituzioneDeposito entity) {
        IstanzaRestituzioneDepositoDto dto = new IstanzaRestituzioneDepositoDto();
        super.mapPropertyIstanzaEntityToDto(entity, dto);
        return dto;
    }

    @Override
    public IstanzaRestituzioneDeposito convertDtoToEntityImpl(IstanzaRestituzioneDepositoDto dto) {
        IstanzaRestituzioneDeposito entity = new IstanzaRestituzioneDeposito();
        super.mapPropertyIstanzaDtoToEntity(dto, entity);
        return entity;
    }
}
