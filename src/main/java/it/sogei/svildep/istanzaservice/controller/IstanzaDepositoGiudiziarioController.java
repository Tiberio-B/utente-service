package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoGiudiziario;
import it.sogei.svildep.istanzaservice.service.IstanzaDepositoGiudiziarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("istanzaDepositoGiudiziario")
public class IstanzaDepositoGiudiziarioController extends IstanzaController<IstanzaDepositoGiudiziario, IstanzaDepositoGiudiziarioDto> {
    
    private final IstanzaDepositoGiudiziarioService service;

}
