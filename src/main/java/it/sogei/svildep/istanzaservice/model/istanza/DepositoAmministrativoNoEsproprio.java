package it.sogei.svildep.istanzaservice.model.istanza;

import it.sogei.svildep.istanzaservice.model.Soggetto;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoAmministrativoNoEsproprio extends Istanza {

    private Soggetto versante;
    private Soggetto ulterioreSoggetto;

    public DepositoAmministrativoNoEsproprio() {
        super();
        this.setCategoriaDeposito(Categoria.DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO);
    }
}
