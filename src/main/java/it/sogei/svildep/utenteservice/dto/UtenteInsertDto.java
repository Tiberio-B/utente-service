package it.sogei.svildep.utenteservice.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import it.sogei.svildep.utenteservice.exception.Messages;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UtenteInsertDto extends SvildepDto{
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String cognome;
	
	@Pattern(regexp=Messages.validazioneCf, message = Messages.codiceFiscaleNonValido)
	private String codiceFiscale; 
	
	@NotBlank
	private String ruoloId;
}
