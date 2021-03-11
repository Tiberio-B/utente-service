package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Soggetto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoCauzionale extends Istanza {

    private Soggetto proprietario;
    private Soggetto enteRichiedente;

    public DepositoCauzionale() {
        super();
        this.setCategoriaDeposito(Categoria.DEPOSITO_CAUZIONALE);
        // if (super.getQualitaRichiedente() == QualitaRichiedente.ME_MEDESIMO) proprietario = richiedente;
    }
}
