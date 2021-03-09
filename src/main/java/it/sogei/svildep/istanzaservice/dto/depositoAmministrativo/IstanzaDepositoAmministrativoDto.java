package it.sogei.svildep.istanzaservice.dto.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.DocumentoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;


import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter

public class IstanzaDepositoAmministrativoDto extends IstanzaDto {

    private SoggettoDto depositante;
    private SoggettoDto autoritaEspropriante;

    private OperaDto datiOpera;
    private BeneDto beneEspropriato;

    private Set<DocumentoDto> allegati;

    IstanzaDepositoAmministrativoDto(SoggettoDto richiedente, DepositoDto datiDeposito) {
        super(richiedente, datiDeposito, "DEPOSITO_AMMINISTRATIVO");
    }
}
