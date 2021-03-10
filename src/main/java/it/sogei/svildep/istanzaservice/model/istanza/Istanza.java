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
    private Categoria categoriaDeposito;
    private Stato stato = Stato.IN_BOZZA;

    private Soggetto richiedente;
    private Deposito datiDeposito;

    private Richiesta datiRichiesta;
    private Protocollo datiProtocollo;

    private Rts rtsInoltro;
    private Set<Documento> allegati;

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

    public enum QualitaRichiedente {

        ME_MEDESIMO,
        TITOLARE_RAPPRESENTANTE_LEGALE,
        RESPONSABILE_UFFICIO_PUBBLICO;
    }
}
