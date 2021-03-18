package it.sogei.svildep.utenteservice.validator;

import it.sogei.svildep.utenteservice.dto.AbilitazioneDto;
import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.exception.Messages;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AbilitazioneValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return AbilitazioneDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        if (obj instanceof AbilitazioneDto) {
            AbilitazioneDto dto = (AbilitazioneDto) obj;
        }
        else errors.rejectValue("class", Messages.invalidDtoCode, Messages.invalidDtoMessage);
    }
}