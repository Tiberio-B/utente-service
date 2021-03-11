package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoGiudiziarioMapper;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoGiudiziario;
import it.sogei.svildep.istanzaservice.repository.DepositoGiudiziarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoGiudiziarioService extends IstanzaService<DepositoGiudiziario, DepositoGiudiziarioDto> {

    private final DepositoGiudiziarioRepository repository;
    private final DepositoGiudiziarioMapper mapper;
}
