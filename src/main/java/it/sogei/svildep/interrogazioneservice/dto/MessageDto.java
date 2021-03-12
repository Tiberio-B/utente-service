package it.sogei.svildep.interrogazioneservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class MessageDto extends Dto {

    private static final String non_autorizzato = "Inserimento effettuato con successo";

    @NonNull private String content;
    private HttpStatus status = HttpStatus.CONTINUE;

    public boolean isError() { return this.getStatus().isError(); }

    public static MessageDto nonAutorizzato() { return new MessageDto(non_autorizzato, HttpStatus.UNAUTHORIZED); }
}
