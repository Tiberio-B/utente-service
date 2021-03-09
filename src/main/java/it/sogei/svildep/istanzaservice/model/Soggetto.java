package it.sogei.svildep.istanzaservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Soggetto implements Entity {

    private Long id;

    private String nome;
    private String cognome;
    private String cf;
    private String partitaIva;
    private Boolean irreperibile;
    private Documento relataNotificaSoggettoNonReperibile;


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
