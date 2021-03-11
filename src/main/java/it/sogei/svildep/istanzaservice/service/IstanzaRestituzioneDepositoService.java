package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaRestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaRestituzioneDepositoMapper;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaRestituzioneDeposito;
import it.sogei.svildep.istanzaservice.repository.IstanzaRestituzioneDepositoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IstanzaRestituzioneDepositoService extends IstanzaService<IstanzaRestituzioneDeposito, IstanzaRestituzioneDepositoDto> {

    private final IstanzaRestituzioneDepositoRepository repository;
    private final IstanzaRestituzioneDepositoMapper mapper;

}
