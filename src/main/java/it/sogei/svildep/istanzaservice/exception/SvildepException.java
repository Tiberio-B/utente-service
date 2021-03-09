package it.sogei.svildep.istanzaservice.exception;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
class SvildepException extends Exception {

    private MessageDto messageDto;

    SvildepException(MessageDto messageDto) {
        super(messageDto.getContent());
        setMessageDto(messageDto);
    }

    SvildepException(String message, HttpStatus status) { this(new MessageDto(message, status)); }
}
