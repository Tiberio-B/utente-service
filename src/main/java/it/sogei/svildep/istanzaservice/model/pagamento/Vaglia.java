package it.sogei.svildep.istanzaservice.model.pagamento;

import it.sogei.svildep.istanzaservice.model.geo.Indirizzo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Vaglia extends ModalitaPagamento {

    private String cognomeDestinatario;
    private String nomeDestinatario;
    private Indirizzo indirizzo;
}
