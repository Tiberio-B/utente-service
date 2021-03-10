package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaDepositoVolontarioMapper;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoVolontario;
import it.sogei.svildep.istanzaservice.repository.IstanzaDepositoVolontarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IstanzaDepositoVolontarioService extends IstanzaService<IstanzaDepositoVolontario, IstanzaDepositoVolontarioDto> {

    private final IstanzaDepositoVolontarioRepository repository;
    private final IstanzaDepositoVolontarioMapper mapper;
}
