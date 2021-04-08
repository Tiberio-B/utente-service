package it.sogei.svildep.utenteservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

import it.sogei.svildep.utenteservice.exception.Messages;


@Getter
@Setter
public abstract class SvildepDto {

	@Pattern(regexp="^(0|[1-9][0-9]*)$", message = Messages.invalidIdMessage)
	private String utenteInserimentoId;

	private String timestampInserimento;

	@Pattern(regexp="^(0|[1-9][0-9]*)$", message = Messages.invalidIdMessage)
	private String utenteAggiornamentoId;

	private String timestampAggiornamento;

}
