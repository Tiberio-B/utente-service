package it.sogei.svildep.utenteservice.controller;

import it.sogei.svildep.utenteservice.dto.AbilitazioneDto;
import it.sogei.svildep.utenteservice.dto.Dto;
import it.sogei.svildep.utenteservice.dto.MessageDto;
import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.exception.BindingException;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import it.sogei.svildep.utenteservice.service.UtenteService;
import it.sogei.svildep.utenteservice.service.external.AuthService;
import it.sogei.svildep.utenteservice.validator.AbilitazioneValidator;
import it.sogei.svildep.utenteservice.validator.UtenteValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("utente")
@RequiredArgsConstructor
public class UtenteController {

    private final UtenteService utenteService;
    private final AuthService authService;
    private final UtenteValidator utenteValidator;
    private final AbilitazioneValidator abilitazioneValidator;

    private void valida(Validator validator, Dto requestDto, BindingResult bindingResult) throws BindingException {
        validator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
    }

    @GetMapping
    public ResponseEntity<List<UtenteDto>> lista(@RequestHeader("authorization") String token) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.ADMIN_ROLE);
        return ResponseEntity.ok().body(utenteService.getAll());
    }

    @PostMapping("ricerca")
    public ResponseEntity<List<UtenteDto>> ricerca(@RequestHeader("authorization") String token, @Valid UtenteDto ricercaDto, BindingResult bindingResult) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.ADMIN_ROLE);
        valida(utenteValidator, ricercaDto, bindingResult);
        return ResponseEntity.ok().body(utenteService.search(ricercaDto));
    }

    @PostMapping("nuovaAbilitazione")
    public ResponseEntity<MessageDto> nuovaAbilitazione(@RequestHeader("authorization") String token, @Valid AbilitazioneDto abilitazioneDto, BindingResult bindingResult) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.ADMIN_ROLE);
        valida(abilitazioneValidator, abilitazioneDto, bindingResult);
        return ResponseEntity.ok().body(utenteService.nuovaAbilitazione(abilitazioneDto));
    }

    @PutMapping("chiudiAbilitazione")
    public ResponseEntity<MessageDto> chiudiAbilitazione(@RequestHeader("authorization") String token, @Valid AbilitazioneDto abilitazioneDto, BindingResult bindingResult) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.ADMIN_ROLE);
        valida(abilitazioneValidator, abilitazioneDto, bindingResult);
        return ResponseEntity.ok().body(utenteService.chiudiAbilitazione(abilitazioneDto));
    }

    @PutMapping("modificaAbilitazione")
    public ResponseEntity<MessageDto> modificaAbilitazione(@RequestHeader("authorization") String token, @Valid AbilitazioneDto abilitazioneDto, BindingResult bindingResult) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.ADMIN_ROLE);
        valida(abilitazioneValidator, abilitazioneDto, bindingResult);
        return ResponseEntity.ok().body(utenteService.modificaAbilitazione(abilitazioneDto));
    }
}
