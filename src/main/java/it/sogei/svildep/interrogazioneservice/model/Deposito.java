package it.sogei.svildep.interrogazioneservice.model;



import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Deposito implements Entity {

    private Long id;

    private String cf;
    private Diritto tipoDiritto;
    private Categoria categoria;
    private String causale;
    private String numeroNazionale;
    private String rts;
    private BigDecimal importo;
    private Stato stato;
    private LocalDateTime dataCostituzione;
    private Boolean bpf;
    private Boolean fondiIncamerati;

    public enum Diritto {
        PRORPRIETARIO, VERSANTE, RICHIEDENTE, AUTORITA_ORDINANTE, AUTORITA_ESPROPRIANTE;
    }

    public enum Categoria {

        DEPOSITO_CAUZIONALE,
        DEPOSITO_GIUDIZIARIO,
        DEPOSITO_AMMINISTRATIVO,
        DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO,
        DEPOSITO_VOLONTARIO,
        DECRETO_SVINCOLO_REINTROITO,
        RESTITUZIONE_DEPOSITO;
    }

    public enum Stato {

        IN_BOZZA;
    }
}
