package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DepositoVolontarioMapper;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoVolontario;
import it.sogei.svildep.istanzaservice.repository.DepositoVolontarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositoVolontarioService extends IstanzaService<DepositoVolontario, DepositoVolontarioDto> {

    private final DepositoVolontarioRepository repository;
    private final DepositoVolontarioMapper mapper;
}
