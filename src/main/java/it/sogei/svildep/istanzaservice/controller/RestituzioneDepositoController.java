package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.RestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.model.istanza.RestituzioneDeposito;
import it.sogei.svildep.istanzaservice.service.RestituzioneDepositoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("restituzioneDeposito")
public class RestituzioneDepositoController extends IstanzaController<RestituzioneDeposito, RestituzioneDepositoDto> {
    
    private final RestituzioneDepositoService service;

}
