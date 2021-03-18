package it.sogei.svildep.utenteservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class UtenteDto extends Dto {

    private String nome;
    private String cognome;
    private String cf;
    private String dataInizioValidita;
    private String dataFineValidita;
    private String abilitato;
    private String ruolo;
    private String rtsId;
}
