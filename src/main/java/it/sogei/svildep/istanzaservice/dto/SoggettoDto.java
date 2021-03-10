package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Soggetto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Getter
@Setter

public class SoggettoDto extends Dto {

    private String nome;
    private String cognome;

    @NotBlank
    private String cf;
    private String partitaIva;
    private String irreperibile;
    private DocumentoDto relataNotificaSoggettoNonReperibile;


    public enum Tipologia {
        FISICO,
        GIURIDICO,
        DITTA,
        INDIVIDUALE;
    }

    public enum Categoria {
        DA_INDIVIDUARE, AUTORITA_ORDINANTE, PRESUNTO_BENEFICIARIO;
    }
}
