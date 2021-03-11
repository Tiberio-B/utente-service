package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoDto;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoAmministrativo;
import it.sogei.svildep.istanzaservice.service.DepositoAmministrativoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("depositoAmministrativo")
public class DepositoAmministrativoController extends IstanzaController<DepositoAmministrativo, DepositoAmministrativoDto> {
    
    private final DepositoAmministrativoService service;

}
