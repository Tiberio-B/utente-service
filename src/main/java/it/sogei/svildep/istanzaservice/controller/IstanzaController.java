package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.exception.BindingException;
import it.sogei.svildep.istanzaservice.exception.SvildepException;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import it.sogei.svildep.istanzaservice.service.IstanzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public abstract class IstanzaController<Entity extends Istanza, Dto extends IstanzaDto> {

    @Autowired
    private IstanzaService<Entity, Dto> service;

    @GetMapping
    public ResponseEntity<List<Dto>> list(@RequestHeader("authorization") String token) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Dto> get(@RequestHeader("authorization") String token, @PathVariable Long id) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        Dto dto = service.get(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }

    @PostMapping
    public ResponseEntity<Dto> insert(@RequestHeader("authorization") String token, @RequestBody Dto requestDto, BindingResult bindingResult) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        validate(bindingResult);
        service.insert(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(requestDto);
    }

    @PutMapping
    public ResponseEntity<Dto> update(@RequestHeader("authorization") String token, @Valid @RequestBody Dto requestDto, BindingResult bindingResult) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        validate(bindingResult);
        boolean created = service.update(requestDto);
        return ResponseEntity.status(created? HttpStatus.CREATED : HttpStatus.OK).body(requestDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Dto> delete(@RequestHeader("authorization") String token, @PathVariable Long id) throws SvildepException {
        // authService.getAuthorizedUser(token, requiredRoles);
        Dto dto = service.delete(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }

    private void validate(BindingResult bindingResult) throws BindingException {
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
    }
}
