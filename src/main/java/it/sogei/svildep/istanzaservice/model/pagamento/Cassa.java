package it.sogei.svildep.istanzaservice.model.pagamento;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cassa extends ModalitaPagamento {

    private String tesoreria;
    private String causale;
}
