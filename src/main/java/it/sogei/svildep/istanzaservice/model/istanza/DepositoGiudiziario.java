package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Soggetto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoGiudiziario extends Istanza {

    private Soggetto versante;
    private Soggetto autoritaOrdinante;
    private Soggetto soggettoUlteriore;

    public DepositoGiudiziario() {
        super();
        this.setCategoriaDeposito(Categoria.DEPOSITO_GIUDIZIARIO);
    }
}
