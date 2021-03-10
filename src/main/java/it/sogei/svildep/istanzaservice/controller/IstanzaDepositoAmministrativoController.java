package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.depositoAmministrativo.IstanzaDepositoAmministrativoDto;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.IstanzaDepositoAmministrativo;
import it.sogei.svildep.istanzaservice.service.IstanzaDepositoAmministrativoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("istanzaDepositoAmministrativo")
public class IstanzaDepositoAmministrativoController extends IstanzaController<IstanzaDepositoAmministrativo, IstanzaDepositoAmministrativoDto> {
    
    private final IstanzaDepositoAmministrativoService service;

}
