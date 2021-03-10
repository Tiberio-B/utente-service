package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class IstanzaDepositoVolontarioDto extends IstanzaDto {

    private SoggettoDto proprietario;

    public IstanzaDepositoVolontarioDto() {
        super();
        this.setCategoriaDeposito("DEPOSITO_VOLONTARIO");
    }
}
