package it.sogei.svildep.istanzaservice.exception;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = "it.sogei.svildep.istanzaservice.controller")
public class ExceptionAdvisor {

	@ExceptionHandler(SvildepException.class)
	public ResponseEntity<MessageDto> handleException(SvildepException e){
		return ResponseEntity.status(e.getMessageDto().getStatus()).body(new MessageDto(e.getMessage()));
	}
 
	@ExceptionHandler(Exception.class)
    public ResponseEntity<MessageDto> handleException(Exception e){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MessageDto(e.getMessage()));
    }

}
