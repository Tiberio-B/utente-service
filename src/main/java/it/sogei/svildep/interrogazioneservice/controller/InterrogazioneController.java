package it.sogei.svildep.interrogazioneservice.controller;

import it.sogei.svildep.interrogazioneservice.dto.DepositoDto;
import it.sogei.svildep.interrogazioneservice.dto.RtsDto;
import it.sogei.svildep.interrogazioneservice.dto.TesoreriaDto;
import it.sogei.svildep.interrogazioneservice.exception.BindingException;
import it.sogei.svildep.interrogazioneservice.exception.SvildepException;
import it.sogei.svildep.interrogazioneservice.service.DepositoService;
import it.sogei.svildep.interrogazioneservice.service.RtsService;
import it.sogei.svildep.interrogazioneservice.service.TesoreriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class InterrogazioneController {

    @Autowired private final RtsService rtsService;
    @Autowired private final DepositoService depositoService;
    @Autowired private final TesoreriaService tesoreriaService;
    // @Autowired private final AuthService authService;

    @GetMapping("rts")
    public ResponseEntity<List<RtsDto>> listaRts(@RequestHeader("authorization") String token) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        return ResponseEntity.ok().body(rtsService.getAll());
    }

    @GetMapping("deposito/{cf}")
    public ResponseEntity<List<DepositoDto>> listaDepositiPerSoggetto(@RequestHeader("authorization") String token, @PathVariable String cf) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        return ResponseEntity.ok().body(depositoService.getAllByCfSoggetto(cf));
    }

    @GetMapping("deposito/{numeroNazionale}")
    public ResponseEntity<DepositoDto> getDeposito(@RequestHeader("authorization") String token, @PathVariable String numeroNazionale) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        DepositoDto dto = depositoService.get(numeroNazionale);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }

    @GetMapping("tesoreria")
    public ResponseEntity<List<TesoreriaDto>> listaTesorerie(@RequestHeader("authorization") String token) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        return ResponseEntity.ok().body(tesoreriaService.getAll());
    }

    @GetMapping("tesoreria/{codice}")
    public ResponseEntity<TesoreriaDto> listaContiPerTesoreria(@RequestHeader("authorization") String token, @PathVariable String codice) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        TesoreriaDto dto = tesoreriaService.get(codice);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }

    private void validate(BindingResult bindingResult) throws BindingException {
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
    }
}
