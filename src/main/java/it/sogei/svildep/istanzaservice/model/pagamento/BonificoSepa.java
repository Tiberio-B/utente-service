package it.sogei.svildep.istanzaservice.model.pagamento;

import it.sogei.svildep.istanzaservice.model.geo.Nazione;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class BonificoSepa extends ModalitaPagamento {

    private Nazione paeseAreaSepa;
    private String iban;
}
