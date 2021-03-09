package it.sogei.svildep.istanzaservice.model;



import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public abstract class Deposito implements Entity {

    private Long id;

    private String causale;
    private BigDecimal importo;
}
