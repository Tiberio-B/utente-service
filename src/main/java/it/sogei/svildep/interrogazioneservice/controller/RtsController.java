package it.sogei.svildep.interrogazioneservice.controller;

import it.sogei.svildep.interrogazioneservice.dto.DepositoDto;
import it.sogei.svildep.interrogazioneservice.dto.RtsDto;
import it.sogei.svildep.interrogazioneservice.exception.SvildepException;
import it.sogei.svildep.interrogazioneservice.service.RtsService;
import it.sogei.svildep.interrogazioneservice.service.external.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rts")
@RequiredArgsConstructor
public class RtsController {

    private final RtsService rtsService;
    private final AuthService authService;

    @GetMapping
    public ResponseEntity<List<RtsDto>> listaRts(@RequestHeader("authorization") String token) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.NOME_RUOLO_ROLE);
        return ResponseEntity.ok().body(rtsService.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<RtsDto> getRts(@RequestHeader("authorization") String token, @PathVariable Long id) throws SvildepException {
        authService.ottieniUtenteAutorizzatoMock(token, AuthService.Role.NOME_RUOLO_ROLE);
        RtsDto dto = rtsService.get(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }
}
