package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class DecretoSvilncoloReintroitoDto extends IstanzaDto {

    DecretoSvilncoloReintroitoDto(SoggettoDto richiedente, DepositoDto datiDeposito) {
        super(richiedente, datiDeposito, "DECRETO_SVINCOLO_REINTROITO");
    }
}
