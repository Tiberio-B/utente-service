package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Deposito;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class DepositoDto extends Dto<Deposito> {

    private String causale;
    private String importo;
}
