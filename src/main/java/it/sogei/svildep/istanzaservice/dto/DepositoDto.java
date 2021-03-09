package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Deposito;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public abstract class DepositoDto extends Dto<Deposito> {

    private String causale;
    private String importo;
}
