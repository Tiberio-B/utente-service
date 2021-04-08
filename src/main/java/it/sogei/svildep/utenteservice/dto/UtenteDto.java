package it.sogei.svildep.utenteservice.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UtenteDto extends SvildepDto {
	
	private String id;
    private String nome;
    private String cognome;
    private String cf;
    private String abilitato;
    private String ruolo;
    private String rtsId;
    private String dataInizioValidita;
    private String dataFineValidita;

}
