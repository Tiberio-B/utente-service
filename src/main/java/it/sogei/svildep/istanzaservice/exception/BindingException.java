package it.sogei.svildep.istanzaservice.exception;

import it.sogei.svildep.istanzaservice.dto.MessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

public class BindingException extends SvildepException {

	public BindingException(BindingResult bindingResult) {
		setMessageDto(new MessageDto(getErrorMessages(bindingResult), HttpStatus.BAD_REQUEST));
	}

	private String getErrorMessages(BindingResult bindingResult) {
		StringBuilder messages = new StringBuilder();
		bindingResult.getFieldErrors().forEach(error -> {
			messages.append(error.getDefaultMessage()).append("\n");
		});
		return messages.toString();
	}
}
