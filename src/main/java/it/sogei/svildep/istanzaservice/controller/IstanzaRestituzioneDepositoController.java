package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaRestituzioneDepositoDto;
import it.sogei.svildep.istanzaservice.model.istanza.IstanzaRestituzioneDeposito;
import it.sogei.svildep.istanzaservice.service.IstanzaRestituzioneDepositoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("istanzaRestituzioneDeposito")
public class IstanzaRestituzioneDepositoController extends IstanzaController<IstanzaRestituzioneDeposito, IstanzaRestituzioneDepositoDto> {
    
    private final IstanzaRestituzioneDepositoService service;

}
