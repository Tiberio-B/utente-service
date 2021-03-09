package it.sogei.svildep.istanzaservice.model.pagamento;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BonificoExtraSepa extends ModalitaPagamento {

    private String descrizioneBanca;
    private String nomeAgenzia;
    private String swiftCode;
    private String numeroConto;
}
