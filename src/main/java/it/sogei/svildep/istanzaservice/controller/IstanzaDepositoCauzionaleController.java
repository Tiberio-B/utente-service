package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDepositoCauzionaleDto;
import it.sogei.svildep.istanzaservice.exception.BindingException;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaDepositoCauzionale;
import it.sogei.svildep.istanzaservice.service.IstanzaDepositoCauzionaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("istanzaDepositoCauzionale")
public class IstanzaDepositoCauzionaleController extends IstanzaController<IstanzaDepositoCauzionale, IstanzaDepositoCauzionaleDto> {

    private final IstanzaDepositoCauzionaleService service;

}
