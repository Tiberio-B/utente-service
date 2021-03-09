package it.sogei.svildep.istanzaservice.model.pagamento;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BonificoDomiciliato extends ModalitaPagamento {

    private String abi;
    private String cab;
}
