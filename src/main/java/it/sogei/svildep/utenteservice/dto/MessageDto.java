package it.sogei.svildep.utenteservice.dto;

import it.sogei.svildep.utenteservice.exception.Messages;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class MessageDto extends Dto {

    private String content;
    private HttpStatus status;

    public boolean isError() { return this.getStatus().isError(); }

    public static MessageDto nonAutorizzato() { return new MessageDto(Messages.nonAutorizzato, HttpStatus.UNAUTHORIZED); }
}
