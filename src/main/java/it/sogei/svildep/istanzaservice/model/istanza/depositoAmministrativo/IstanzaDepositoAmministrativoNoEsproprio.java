package it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.model.Soggetto;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepositoAmministrativoNoEsproprio extends Istanza {

    private Soggetto versante;
    private Soggetto ulterioreSoggetto;

    public IstanzaDepositoAmministrativoNoEsproprio() {
        super();
        this.setCategoriaDeposito(Categoria.DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO);
    }
}
