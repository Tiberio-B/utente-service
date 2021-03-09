package it.sogei.svildep.istanzaservice.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public abstract class Deposito implements Entity {

    private Long id;

    private String causale;
    private BigDecimal importo;
}
