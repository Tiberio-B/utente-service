package it.sogei.svildep.utenteservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoggettoDto extends Dto {

    private String nome;
    private String cognome;
    private String cf;
    private String partitaIva;
    private String irreperibile;
}
