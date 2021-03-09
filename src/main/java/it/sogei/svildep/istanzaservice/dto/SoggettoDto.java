package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Soggetto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class SoggettoDto extends Dto<Soggetto> {

    private String nome;
    private String cognome;
    private String cf;
    private String partitaIva;
    private Boolean irreperibile;
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
