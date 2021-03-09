package it.sogei.svildep.istanzaservice.model.pagamento;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class BonificoExtraSepa extends ModalitaPagamento {

    private String descrizioneBanca;
    private String nomeAgenzia;
    private String swiftCode;
    private String numeroConto;
}
