package it.sogei.svildep.interrogazioneservice.controller;

import it.sogei.svildep.interrogazioneservice.dto.TesoreriaDto;
import it.sogei.svildep.interrogazioneservice.exception.BindingException;
import it.sogei.svildep.interrogazioneservice.exception.SvildepException;
import it.sogei.svildep.interrogazioneservice.service.TesoreriaService;
import it.sogei.svildep.interrogazioneservice.service.external.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
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
