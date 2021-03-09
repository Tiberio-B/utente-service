package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.pagamento.BonificoDomiciliato;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BonificoDomiciliatoDto extends Dto<BonificoDomiciliato> {

    private String abi;
    private String cab;
}
