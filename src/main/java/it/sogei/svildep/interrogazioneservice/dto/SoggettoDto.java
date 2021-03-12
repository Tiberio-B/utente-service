package it.sogei.svildep.interrogazioneservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class SoggettoDto extends Dto {

    private String nome;
    private String cognome;
    private String cf;
    private String partitaIva;
    private String irreperibile;
}
