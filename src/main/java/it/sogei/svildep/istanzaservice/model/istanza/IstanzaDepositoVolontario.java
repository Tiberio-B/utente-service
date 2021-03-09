package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Deposito;
import it.sogei.svildep.istanzaservice.model.Soggetto;

public class IstanzaDepositoVolontario extends Istanza {

    private Soggetto proprietario;

    IstanzaDepositoVolontario(Soggetto richiedente, Deposito datiDeposito) {
        super(richiedente, datiDeposito, Categoria.DEPOSITO_VOLONTARIO);
    }
}
