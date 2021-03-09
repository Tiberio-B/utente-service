package it.sogei.svildep.istanzaservice.model.pagamento;

import it.sogei.svildep.istanzaservice.model.geo.Indirizzo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vaglia extends ModalitaPagamento {

    private String cognomeDestinatario;
    private String nomeDestinatario;
    private Indirizzo indirizzo;
}
