package it.sogei.svildep.istanzaservice.controller;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.exception.AuthorizationException;
import it.sogei.svildep.istanzaservice.exception.BindingException;
import it.sogei.svildep.istanzaservice.model.Entity;
import it.sogei.svildep.istanzaservice.model.Role;
import it.sogei.svildep.istanzaservice.service.Service;
import it.sogei.svildep.istanzaservice.service.external.AuthService;
import it.sogei.svildep.istanzaservice.validator.DtoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class Controller<E extends Entity, D extends Dto<E>> {

    private final Service<E, D> service;
    private final DtoValidator<D> validator;
    private final Role[] requiredRoles;

    @Autowired
    private AuthService authService;

    Controller(Service<E, D> service, DtoValidator<D> validator, Role... requiredRoles) {
        this.service = service;
        this.validator = validator;
        this.requiredRoles = requiredRoles;
    }

    @GetMapping
    public ResponseEntity<List<D>> list(@RequestHeader("authorization") String token) throws AuthorizationException {
        authService.getAuthorizedUser(token, requiredRoles);
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<D> get(@RequestHeader("authorization") String token, @PathVariable Long id) throws AuthorizationException {
        authService.getAuthorizedUser(token, requiredRoles);
        D dto = service.get(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }

    @PostMapping
    public ResponseEntity<D> insert(@RequestHeader("authorization") String token, @RequestBody D requestDto, BindingResult bindingResult) throws AuthorizationException, BindingException {
        authService.getAuthorizedUser(token, requiredRoles);
        validate(requestDto, bindingResult);
        service.prepareInsert(requestDto);
        service.insert(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(requestDto);
    }

    @PutMapping
    public ResponseEntity<D> update(@RequestHeader("authorization") String token, @RequestBody D requestDto, BindingResult bindingResult) throws AuthorizationException, BindingException {
        authService.getAuthorizedUser(token, requiredRoles);
        validate(requestDto, bindingResult);
        boolean created = service.update(requestDto);
        return ResponseEntity.status(created? HttpStatus.CREATED : HttpStatus.OK).body(requestDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<D> delete(@RequestHeader("authorization") String token, @PathVariable Long id) throws AuthorizationException {
        authService.getAuthorizedUser(token, requiredRoles);
        D dto = service.delete(id);
        return ResponseEntity.status(dto == null? HttpStatus.NOT_FOUND : HttpStatus.OK).body(dto);
    }

    private void validate(D requestDto, BindingResult bindingResult) throws BindingException {
        validator.validate(requestDto, bindingResult);
        if (bindingResult.hasErrors()) throw new BindingException(bindingResult);
    }

}
