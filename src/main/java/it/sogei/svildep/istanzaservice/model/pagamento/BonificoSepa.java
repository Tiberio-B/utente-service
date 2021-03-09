package it.sogei.svildep.istanzaservice.model.pagamento;

import it.sogei.svildep.istanzaservice.model.geo.Nazione;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BonificoSepa extends ModalitaPagamento {

    private Nazione paeseAreaSepa;
    private String iban;
}
