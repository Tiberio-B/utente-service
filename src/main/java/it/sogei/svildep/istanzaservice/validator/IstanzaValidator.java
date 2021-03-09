package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.MessageDto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class IstanzaValidator extends DtoValidator<IstanzaDto> {

    @Override
    public boolean supports(Class<?> aClass) {
        return IstanzaDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        super.validate(o, errors);
        if (o instanceof IstanzaDto) {
            IstanzaDto dto = (IstanzaDto) o;
        }
        else {
            errors.rejectValue("class", "incompatibleDto", MessageDto.INCOMPATIBLE_DTO);
        }
    }
}
