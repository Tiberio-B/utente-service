package it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.model.Soggetto;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepositoAmministrativo extends Istanza {

    private Soggetto depositante;
    private Soggetto autoritaEspropriante;

    private Opera datiOpera;
    private Bene beneEspropriato;

    public IstanzaDepositoAmministrativo() {
        super();
        this.setCategoriaDeposito(Categoria.DEPOSITO_AMMINISTRATIVO);
    }
}
