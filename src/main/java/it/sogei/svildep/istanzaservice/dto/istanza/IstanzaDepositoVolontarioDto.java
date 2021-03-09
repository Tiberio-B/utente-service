package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IstanzaDepositoVolontarioDto extends IstanzaDto {

    private SoggettoDto proprietario;

    IstanzaDepositoVolontarioDto(SoggettoDto richiedente, DepositoDto datiDeposito) {
        super(richiedente, datiDeposito, "DEPOSITO_VOLONTARIO");
    }
}
