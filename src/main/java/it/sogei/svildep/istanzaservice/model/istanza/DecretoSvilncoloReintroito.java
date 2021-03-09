package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Deposito;
import it.sogei.svildep.istanzaservice.model.Soggetto;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DecretoSvilncoloReintroito extends Istanza {

    public DecretoSvilncoloReintroito(Soggetto richiedente, Deposito datiDeposito) {
        super(richiedente, datiDeposito, Categoria.DECRETO_SVINCOLO_REINTROITO);
    }
}
