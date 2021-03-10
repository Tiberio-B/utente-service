package it.sogei.svildep.istanzaservice.dto.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.istanza.IstanzaDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class IstanzaDepositoAmministrativoNoEsproprioDto extends IstanzaDto {

    private SoggettoDto versante;
    private SoggettoDto ulterioreSoggetto;

    public IstanzaDepositoAmministrativoNoEsproprioDto() {
        super();
        this.setCategoriaDeposito("DEPOSITO_AMMINISTRATIVO_NO_ESPROPRIO");
    }
}
