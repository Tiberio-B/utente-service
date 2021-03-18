package it.sogei.svildep.utenteservice.validator;

import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UtenteValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return UtenteDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        if (obj instanceof UtenteDto) {
            UtenteDto dto = (UtenteDto) obj;
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}
