package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.IstanzaDepositoGiudiziarioMapper;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoGiudiziario;
import it.sogei.svildep.istanzaservice.repository.IstanzaDepositoGiudiziarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IstanzaDepositoGiudiziarioService extends IstanzaService<IstanzaDepositoGiudiziario, IstanzaDepositoGiudiziarioDto> {

    private final IstanzaDepositoGiudiziarioRepository repository;
    private final IstanzaDepositoGiudiziarioMapper mapper;
}
