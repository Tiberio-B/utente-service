package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.RestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.RestituzioneDepositoMapper;
import it.sogei.svildep.istanzaservice.model.istanza.RestituzioneDeposito;
import it.sogei.svildep.istanzaservice.repository.RestituzioneDepositoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RestituzioneDepositoService extends IstanzaService<RestituzioneDeposito, RestituzioneDepositoDto> {

    private final RestituzioneDepositoRepository repository;
    private final RestituzioneDepositoMapper mapper;

}
