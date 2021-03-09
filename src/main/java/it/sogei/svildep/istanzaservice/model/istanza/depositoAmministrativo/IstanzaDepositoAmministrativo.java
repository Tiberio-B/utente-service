package it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.model.Documento;
import it.sogei.svildep.istanzaservice.model.Soggetto;
import it.sogei.svildep.istanzaservice.model.Deposito;
import it.sogei.svildep.istanzaservice.model.istanza.Istanza;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class IstanzaDepositoAmministrativo extends Istanza {

    private Soggetto depositante;
    private Soggetto autoritaEspropriante;

    private Opera datiOpera;
    private Bene beneEspropriato;

    private Set<Documento> allegati;

    IstanzaDepositoAmministrativo(Soggetto richiedente, Deposito datiDeposito) {
        super(richiedente, datiDeposito, CategoriaDeposito.DEPOSITO_AMMINISTRATIVO);
    }
}
