package it.sogei.svildep.utenteservice.controller;

import java.util.List;

import javax.validation.Valid;

import it.sogei.svildep.utenteservice.dto.*;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

import it.sogei.svildep.utenteservice.service.UtenteService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("utente")
@RequiredArgsConstructor
public class UtenteController {
@Autowired
    public UtenteService utenteService;

    @GetMapping
    public ResponseEntity<List<UtenteDto>> lista() throws SvildepException {
        return ResponseEntity.ok().body(utenteService.getAll());
    }

    @PostMapping("nuovaAbilitazione")
    public ResponseEntity<MessageDto> nuovaAbilitazione(@Valid @RequestBody AbilitazioneDto abilitazioneDto, BindingResult bindingResult) throws SvildepException {
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.ok().body(utenteService.nuovaAbilitazione(abilitazioneDto));
    }


    @PutMapping("chiudiAbilitazione")
    public ResponseEntity<MessageDto> chiudiAbilitazione(@Valid @RequestBody AbilitazioneDto abilitazioneDto, BindingResult bindingResult) throws SvildepException {
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.ok().body(utenteService.chiudiAbilitazione(abilitazioneDto));
    }

    @PutMapping("modificaAbilitazione")
    public ResponseEntity<MessageDto> modificaAbilitazione(@Valid @RequestBody ModificaAbilitazioneDto modificaAbilitazioneDto, BindingResult bindingResult) throws SvildepException {
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
        return ResponseEntity.ok().body(utenteService.modificaAbilitazione(modificaAbilitazioneDto));
    }


   
}
