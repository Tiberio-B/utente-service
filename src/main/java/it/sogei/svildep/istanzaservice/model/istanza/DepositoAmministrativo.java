package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Soggetto;
import it.sogei.svildep.istanzaservice.model.Bene;
import it.sogei.svildep.istanzaservice.model.Opera;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoAmministrativo extends Istanza {

    private Soggetto depositante;
    private Soggetto autoritaEspropriante;

    private Opera datiOpera;
    private Bene beneEspropriato;

    public DepositoAmministrativo() {
        super();
        this.setCategoriaDeposito(Categoria.DEPOSITO_AMMINISTRATIVO);
    }
}
