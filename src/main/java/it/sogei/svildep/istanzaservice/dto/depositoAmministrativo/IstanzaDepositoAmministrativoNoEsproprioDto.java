package it.sogei.svildep.istanzaservice.dto.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IstanzaDepositoAmministrativoNoEsproprioDto extends IstanzaDto {

    private SoggettoDto versante;
    private SoggettoDto ulterioreSoggetto;

    IstanzaDepositoAmministrativoNoEsproprioDto(SoggettoDto richiedente, DepositoDto datiDeposito) {
        super(richiedente, datiDeposito, "DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO");
    }
}
