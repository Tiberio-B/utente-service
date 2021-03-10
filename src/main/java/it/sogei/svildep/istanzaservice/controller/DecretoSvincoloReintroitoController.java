package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.DecretoSvincoloReintroitoDto;
import it.sogei.svildep.istanzaservice.model.istanza.DecretoSvincoloReintroito;
import it.sogei.svildep.istanzaservice.service.DecretoSvincoloReintroitoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("decretoSvincoloReintroito")
public class DecretoSvincoloReintroitoController extends IstanzaController<DecretoSvincoloReintroito, DecretoSvincoloReintroitoDto> {
    
    private final DecretoSvincoloReintroitoService service;

}
