package it.sogei.svildep.interrogazioneservice.controller;

import it.sogei.svildep.interrogazioneservice.dto.DepositoDto;
import it.sogei.svildep.interrogazioneservice.dto.RtsDto;
import it.sogei.svildep.interrogazioneservice.dto.TesoreriaDto;
import it.sogei.svildep.interrogazioneservice.exception.BindingException;
import it.sogei.svildep.interrogazioneservice.exception.SvildepException;
import it.sogei.svildep.interrogazioneservice.service.DepositoService;
import it.sogei.svildep.interrogazioneservice.service.RtsService;
import it.sogei.svildep.interrogazioneservice.service.TesoreriaService;
import it.sogei.svildep.interrogazioneservice.service.external.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("deposito")
@RequiredArgsConstructor
public class DepositoController {

    private final DepositoService depositoService;
    private final AuthService authService;

    @GetMapping("{cf}")
    public ResponseEntity<List<DepositoDto>> listaDepositiPerSoggetto(@RequestHeader("authorization") String token, @PathVariable String cf) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.NOME_RUOLO_ROLE);
        return ResponseEntity.ok().body(depositoService.getAllByCfSoggetto(cf));
    }

    @GetMapping("{numeroNazionale}")
    public ResponseEntity<DepositoDto> getDeposito(@RequestHeader("authorization") String token, @PathVariable String numeroNazionale) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.NOME_RUOLO_ROLE);
        DepositoDto dto = depositoService.get(numeroNazionale);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }
}