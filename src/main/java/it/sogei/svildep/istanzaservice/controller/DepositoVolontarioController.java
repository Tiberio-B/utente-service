package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoVolontario;
import it.sogei.svildep.istanzaservice.service.DepositoVolontarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("depositoVolontario")
public class DepositoVolontarioController extends IstanzaController<DepositoVolontario, DepositoVolontarioDto> {
    
    private final DepositoVolontarioService service;

}
