package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IstanzaDepositoGiudiziarioDto extends IstanzaDto {

    private SoggettoDto versante;
    private SoggettoDto autoritaOrdinante;
    private SoggettoDto soggettoUlteriore;

    public IstanzaDepositoGiudiziarioDto() {
        super();
        this.setCategoriaDeposito("DEPOSITO_GIUDIZIARIO");
    }
}
