package it.sogei.svildep.utenteservice.controller;

import java.util.List;

import javax.validation.Valid;

import it.sogei.svildep.utenteservice.exception.SvildepException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.sogei.svildep.utenteservice.dto.AbilitazioneDto;
import it.sogei.svildep.utenteservice.dto.MessageDto;
import it.sogei.svildep.utenteservice.dto.SvildepDto;
import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.service.UtenteService;
import it.sogei.svildep.utenteservice.validator.AbilitazioneValidator;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("utente")
@RequiredArgsConstructor
public class UtenteController {

    private final UtenteService utenteService;
    private final AbilitazioneValidator abilitazioneValidator;

    private void valida(Validator validator, SvildepDto requestDto, BindingResult bindingResult) throws SvildepException {
        validator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new SvildepException(bindingResult);
    }

    @GetMapping
    public ResponseEntity<List<UtenteDto>> lista() throws SvildepException {
        return ResponseEntity.ok().body(utenteService.getAll());
    }

//    @PostMapping("ricerca")
//    public ResponseEntity<List<UtenteDto>> ricerca(@Valid UtenteDto ricercaDto, BindingResult bindingResult) throws SvildepException {
//        valida(utenteValidator, ricercaDto, bindingResult);
//        return ResponseEntity.ok().body(utenteService.search(ricercaDto));
//    }

    @PostMapping("nuovaAbilitazione")
    public ResponseEntity<MessageDto> nuovaAbilitazione(@Valid AbilitazioneDto abilitazioneDto, BindingResult bindingResult) throws SvildepException {
        valida(abilitazioneValidator, abilitazioneDto, bindingResult);
        return ResponseEntity.ok().body(utenteService.nuovaAbilitazione(abilitazioneDto));
    }

    @PutMapping("chiudiAbilitazione")
    public ResponseEntity<MessageDto> chiudiAbilitazione(@Valid AbilitazioneDto abilitazioneDto, BindingResult bindingResult) throws SvildepException {
        valida(abilitazioneValidator, abilitazioneDto, bindingResult);
        return ResponseEntity.ok().body(utenteService.chiudiAbilitazione(abilitazioneDto));
    }

    @PutMapping("modificaAbilitazione")
    public ResponseEntity<MessageDto> modificaAbilitazione(@Valid AbilitazioneDto abilitazioneDto, BindingResult bindingResult) throws SvildepException {
        valida(abilitazioneValidator, abilitazioneDto, bindingResult);
        return ResponseEntity.ok().body(utenteService.modificaAbilitazione(abilitazioneDto));
    }
    
    
   
}
