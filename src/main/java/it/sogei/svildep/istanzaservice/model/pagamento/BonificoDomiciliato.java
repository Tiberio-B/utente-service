package it.sogei.svildep.istanzaservice.model.pagamento;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class BonificoDomiciliato extends ModalitaPagamento {

    private String abi;
    private String cab;
}
