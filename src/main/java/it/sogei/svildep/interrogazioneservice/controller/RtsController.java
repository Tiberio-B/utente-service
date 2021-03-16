package it.sogei.svildep.interrogazioneservice.controller;

import it.sogei.svildep.interrogazioneservice.dto.RtsDto;
import it.sogei.svildep.interrogazioneservice.exception.SvildepException;
import it.sogei.svildep.interrogazioneservice.service.RtsService;
import it.sogei.svildep.interrogazioneservice.service.external.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
