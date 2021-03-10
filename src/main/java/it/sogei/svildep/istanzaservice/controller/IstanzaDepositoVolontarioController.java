package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDepositoVolontarioDto;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoVolontario;
import it.sogei.svildep.istanzaservice.service.IstanzaDepositoVolontarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("istanzaDepositoVolontario")
public class IstanzaDepositoVolontarioController extends IstanzaController<IstanzaDepositoVolontario, IstanzaDepositoVolontarioDto> {
    
    private final IstanzaDepositoVolontarioService service;

}
