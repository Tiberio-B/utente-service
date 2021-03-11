package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Soggetto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepositoGiudiziario extends Istanza {

    private Soggetto versante;
    private Soggetto autoritaOrdinante;
    private Soggetto soggettoUlteriore;

    public IstanzaDepositoGiudiziario() {
        super();
        this.setCategoriaDeposito(Categoria.DEPOSITO_GIUDIZIARIO);
    }
}
