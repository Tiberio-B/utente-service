package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Deposito;
import it.sogei.svildep.istanzaservice.model.Soggetto;

public class IstanzaDepositoCauzionale extends Istanza {

    private Soggetto proprietario;
    private Soggetto enteRichiedente;

    IstanzaDepositoCauzionale(Soggetto richiedente, Deposito datiDeposito) {
        super(richiedente, datiDeposito, CategoriaDeposito.DEPOSITO_CAUZIONALE);
        if (super.getQualitaRichiedente() == QualitaRichiedente.ME_MEDESIMO) proprietario = richiedente;
    }
}
