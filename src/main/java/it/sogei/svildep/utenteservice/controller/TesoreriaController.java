package it.sogei.svildep.utenteservice.controller;

import it.sogei.svildep.utenteservice.dto.TesoreriaDto;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import it.sogei.svildep.utenteservice.service.TesoreriaService;
import it.sogei.svildep.utenteservice.service.external.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tesoreria")
@RequiredArgsConstructor
public class TesoreriaController {

    private final TesoreriaService tesoreriaService;
    private final AuthService authService;

    @GetMapping
    public ResponseEntity<List<TesoreriaDto>> listaTesorerie(@RequestHeader("authorization") String token) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.NOME_RUOLO_ROLE);
        return ResponseEntity.ok().body(tesoreriaService.getAll());
    }

    @GetMapping("{codice}")
    public ResponseEntity<TesoreriaDto> listaContiPerTesoreria(@RequestHeader("authorization") String token, @PathVariable String codice) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.NOME_RUOLO_ROLE);
        TesoreriaDto dto = tesoreriaService.get(codice);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }
}
