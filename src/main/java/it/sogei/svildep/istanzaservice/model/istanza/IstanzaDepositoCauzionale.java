package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Soggetto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepositoCauzionale extends Istanza {

    private Soggetto proprietario;
    private Soggetto enteRichiedente;

    public IstanzaDepositoCauzionale() {
        super();
        this.setCategoriaDeposito(Categoria.DEPOSITO_CAUZIONALE);
        // if (super.getQualitaRichiedente() == QualitaRichiedente.ME_MEDESIMO) proprietario = richiedente;
    }
}
