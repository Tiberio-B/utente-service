package it.sogei.svildep.istanzaservice.dto.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class IstanzaDepositoAmministrativoDto extends IstanzaDto {

    private SoggettoDto depositante;
    private SoggettoDto autoritaEspropriante;

    private OperaDto datiOpera;
    private BeneDto beneEspropriato;

    IstanzaDepositoAmministrativoDto(SoggettoDto richiedente, DepositoDto datiDeposito) {
        super(richiedente, datiDeposito, "DEPOSITO_AMMINISTRATIVO");
    }
}
