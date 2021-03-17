package it.sogei.svildep.utenteservice.controller;

import it.sogei.svildep.utenteservice.dto.RtsDto;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import it.sogei.svildep.utenteservice.service.RtsService;
import it.sogei.svildep.utenteservice.service.external.AuthService;
import lombok.RequiredArgsConstructor;
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
