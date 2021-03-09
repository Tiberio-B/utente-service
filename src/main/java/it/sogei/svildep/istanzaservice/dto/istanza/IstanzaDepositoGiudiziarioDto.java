package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IstanzaDepositoGiudiziarioDto extends IstanzaDto {

    private SoggettoDto versante;
    private SoggettoDto autoritaOrdinante;
    private SoggettoDto soggettoUlteriore;

    IstanzaDepositoGiudiziarioDto(SoggettoDto richiedente, DepositoDto datiDeposito) {
        super(richiedente, datiDeposito, "DEPOSITO_GIUDIZIARIO");
    }
}
