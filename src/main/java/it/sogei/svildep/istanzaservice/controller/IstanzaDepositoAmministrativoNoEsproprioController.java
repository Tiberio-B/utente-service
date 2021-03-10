package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoNoEsproprioDto;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoNoEsproprio;
import it.sogei.svildep.istanzaservice.service.IstanzaDepositoAmministrativoNoEsproprioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("istanzaDepositoAmministrativoNoEsproprio")
public class IstanzaDepositoAmministrativoNoEsproprioController extends IstanzaController<IstanzaDepositoAmministrativoNoEsproprio, IstanzaDepositoAmministrativoNoEsproprioDto> {
    
    private final IstanzaDepositoAmministrativoNoEsproprioService service;

}
