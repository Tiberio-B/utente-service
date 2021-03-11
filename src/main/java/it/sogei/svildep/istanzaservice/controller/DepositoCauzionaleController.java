package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.DepositoCauzionaleDto;
import it.sogei.svildep.istanzaservice.model.istanza.DepositoCauzionale;
import it.sogei.svildep.istanzaservice.service.DepositoCauzionaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("depositoCauzionale")
public class DepositoCauzionaleController extends IstanzaController<DepositoCauzionale, DepositoCauzionaleDto> {

    private final DepositoCauzionaleService service;

}
