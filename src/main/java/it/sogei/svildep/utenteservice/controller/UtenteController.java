package it.sogei.svildep.utenteservice.controller;

import it.sogei.svildep.utenteservice.dto.AbilitazioneDto;
import it.sogei.svildep.utenteservice.dto.MessageDto;
import it.sogei.svildep.utenteservice.dto.ModificaAbilitazioneDto;
import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import it.sogei.svildep.utenteservice.service.UtenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("utente")
@RequiredArgsConstructor
public class UtenteController {

    public final UtenteService utenteService;

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
