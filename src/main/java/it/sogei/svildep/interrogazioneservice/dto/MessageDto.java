package it.sogei.svildep.interrogazioneservice.dto;

import it.sogei.svildep.interrogazioneservice.exception.Messages;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class MessageDto extends Dto {

    private final String content;
    private HttpStatus status = HttpStatus.CONTINUE;

    public boolean isError() { return this.getStatus().isError(); }

    public static MessageDto nonAutorizzato() { return new MessageDto(Messages.nonAutorizzato, HttpStatus.UNAUTHORIZED); }
}
