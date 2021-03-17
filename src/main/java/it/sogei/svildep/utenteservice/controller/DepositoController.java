package it.sogei.svildep.utenteservice.controller;

import it.sogei.svildep.utenteservice.dto.DepositoDto;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import it.sogei.svildep.utenteservice.service.DepositoService;
import it.sogei.svildep.utenteservice.service.external.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("deposito")
@RequiredArgsConstructor
public class DepositoController {

    private final DepositoService depositoService;
    private final AuthService authService;

    @GetMapping
    public ResponseEntity<List<DepositoDto>> listaDepositi(@RequestHeader("authorization") String token) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.NOME_RUOLO_ROLE);
        return ResponseEntity.ok().body(depositoService.getAll());
    }

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
