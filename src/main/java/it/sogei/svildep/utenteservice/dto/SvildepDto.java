package it.sogei.svildep.utenteservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

import it.sogei.svildep.utenteservice.exception.Messages;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public abstract class SvildepDto {


	private String utenteInserimentoId;

	private String timestampInserimento;

	private String utenteAggiornamentoId;

	private String timestampAggiornamento;

}
