package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.*;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public abstract class Istanza implements Entity {

    private Long id;

    private QualitaRichiedente qualitaRichiedente;

    private Soggetto richiedente;

    private Deposito datiDeposito;
    private Categoria categoriaDeposito;

    private Richiesta datiRichiesta;
    private Protocollo datiProtocollo;

    private Rts rtsInoltro;

    private Set<Documento> allegati;

    private Stato stato = Stato.IN_BOZZA;

    public Istanza(Soggetto richiedente, Deposito datiDeposito, Categoria categoriaDeposito) {
        this.richiedente = richiedente;
        this.datiDeposito = datiDeposito;
        this.categoriaDeposito = categoriaDeposito;
    }

    public enum Categoria {

        DEPOSITO_CAUZIONALE,
        DEPOSITO_GIUDIZIARIO,
        DEPOSITO_AMMINISTRATIVO,
        DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO,
        DEPOSITO_VOLONTARIO,
        DECRETO_SVINCOLO_REINTROITO;

    }

    public enum Stato {

        IN_BOZZA;
    }

    public enum QualitaRichiedente {

        ME_MEDESIMO,
        TITOLARE_RAPPRESENTANTE_LEGALE,
        RESPONSABILE_UFFICIO_PUBBLICO;
    }
}
