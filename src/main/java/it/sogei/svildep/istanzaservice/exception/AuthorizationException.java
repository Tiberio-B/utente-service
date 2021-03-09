package it.sogei.svildep.istanzaservice.exception;

import it.sogei.svildep.istanzaservice.dto.MessageDto;

public class AuthorizationException extends SvildepException {

    public AuthorizationException() { super(MessageDto.nonAutorizzato()); }
}
