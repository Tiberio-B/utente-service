package it.sogei.svildep.istanzaservice.validator;

import it.sogei.svildep.istanzaservice.dto.Dto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public abstract class DtoValidator<D extends Dto> implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Dto.class.isAssignableFrom(aClass);
    }

	@Override
	public void validate(Object obj, Errors errors) {
		if (obj instanceof Dto) {
			Dto dto = (Dto) obj;
			if (parseId(dto.getId()) < 0) errors.rejectValue("id", "invalidId", Dto.INVALID_ID);
		}
		else errors.rejectValue("class", "notADto", Dto.NOT_A_DTO);
	}

	private static Integer parseId(String id) {
		try { return Integer.parseInt(id);
		} catch (NumberFormatException e) { return -1; }
	}
}
