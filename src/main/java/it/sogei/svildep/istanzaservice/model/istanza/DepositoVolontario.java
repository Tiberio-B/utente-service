package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Soggetto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoVolontario extends Istanza {

    private Soggetto proprietario;

    public DepositoVolontario() {
        super();
        this.setCategoriaDeposito(Categoria.DEPOSITO_VOLONTARIO);
    }
}
