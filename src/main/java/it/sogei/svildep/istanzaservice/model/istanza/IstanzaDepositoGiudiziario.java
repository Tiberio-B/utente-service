package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Deposito;
import it.sogei.svildep.istanzaservice.model.Soggetto;

public class IstanzaDepositoGiudiziario extends Istanza {

    private Soggetto versante;
    private Soggetto autoritaOrdinante;
    private Soggetto soggettoUlteriore;

    IstanzaDepositoGiudiziario(Soggetto richiedente, Deposito datiDeposito) {
        super(richiedente, datiDeposito, CategoriaDeposito.DEPOSITO_GIUDIZIARIO);
    }
}
