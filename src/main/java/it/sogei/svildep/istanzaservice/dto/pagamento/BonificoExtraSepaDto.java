package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.pagamento.BonificoExtraSepa;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BonificoExtraSepaDto extends Dto<BonificoExtraSepa> {

    private String descrizioneBanca;
    private String nomeAgenzia;
    private String swiftCode;
    private String numeroConto;
}
