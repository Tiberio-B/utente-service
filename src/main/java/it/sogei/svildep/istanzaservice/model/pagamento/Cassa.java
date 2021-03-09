package it.sogei.svildep.istanzaservice.model.pagamento;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Cassa extends ModalitaPagamento {

    private String tesoreria;
    private String causale;
}
