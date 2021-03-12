package it.sogei.svildep.interrogazioneservice.validator;

import it.sogei.svildep.interrogazioneservice.dto.Dto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public abstract class DtoValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Dto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        if (obj instanceof Dto) {
            Dto dto = (Dto) obj;
        }
        else errors.rejectValue("class", "notADto", "NOT_A_DTO");
    }
}
