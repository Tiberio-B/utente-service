package it.sogei.svildep.utenteservice.exception;

import it.sogei.svildep.utenteservice.dto.MessageDto;

public class AuthorizationException extends SvildepException {

    public AuthorizationException() { super(MessageDto.nonAutorizzato()); }
}
