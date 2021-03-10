package it.sogei.svildep.istanzaservice.service;

import it.sogei.svildep.istanzaservice.dto.istanza.DecretoSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.mapper.istanza.DecretoSvincoloReintroitoMapper;
import it.sogei.svildep.istanzaservice.model.istanza.DecretoSvincoloReintroito;
import it.sogei.svildep.istanzaservice.repository.DecretoSvincoloReintroitoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DecretoSvincoloReintroitoService extends IstanzaService<DecretoSvincoloReintroito, DecretoSvincoloReintroitoDto> {

    private final DecretoSvincoloReintroitoRepository repository;
    private final DecretoSvincoloReintroitoMapper mapper;
}
