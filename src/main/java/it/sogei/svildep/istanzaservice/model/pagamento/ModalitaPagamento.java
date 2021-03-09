package it.sogei.svildep.istanzaservice.model.pagamento;

import it.sogei.svildep.istanzaservice.model.Entity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public abstract class ModalitaPagamento implements Entity {

    private Long id;
}
