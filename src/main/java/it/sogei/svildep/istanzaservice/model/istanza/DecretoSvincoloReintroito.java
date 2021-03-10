package it.sogei.svildep.istanzaservice.model.istanza;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DecretoSvincoloReintroito extends Istanza {

    public DecretoSvincoloReintroito() {
        super();
        this.setCategoriaDeposito(Categoria.DECRETO_SVINCOLO_REINTROITO);
    }
}
