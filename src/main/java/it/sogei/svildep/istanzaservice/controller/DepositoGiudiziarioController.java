package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoGiudiziarioDto;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoGiudiziario;
import it.sogei.svildep.istanzaservice.service.DepositoGiudiziarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("depositoGiudiziario")
public class DepositoGiudiziarioController extends IstanzaController<DepositoGiudiziario, DepositoGiudiziarioDto> {
    
    private final DepositoGiudiziarioService service;

}
