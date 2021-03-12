package it.sogei.svildep.interrogazioneservice.exception;

import it.sogei.svildep.interrogazioneservice.dto.MessageDto;

public class AuthorizationException extends SvildepException {

    public AuthorizationException() { super(MessageDto.nonAutorizzato()); }
}
