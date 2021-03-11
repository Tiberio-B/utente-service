package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoAmministrativoNoEsproprioDto;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoAmministrativoNoEsproprio;
import it.sogei.svildep.istanzaservice.service.DepositoAmministrativoNoEsproprioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("depositoAmministrativoNoEsproprio")
public class DepositoAmministrativoNoEsproprioController extends IstanzaController<DepositoAmministrativoNoEsproprio, DepositoAmministrativoNoEsproprioDto> {
    
    private final DepositoAmministrativoNoEsproprioService service;

}
