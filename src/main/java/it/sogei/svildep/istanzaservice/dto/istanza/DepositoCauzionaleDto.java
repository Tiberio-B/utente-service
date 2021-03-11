package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoCauzionaleDto extends IstanzaDto {

    private SoggettoDto proprietario;
    private SoggettoDto enteRichiedente;

    public DepositoCauzionaleDto() {
        super();
        this.setCategoriaDeposito("DEPOSITO_CAUZIONALE");
    }

}
