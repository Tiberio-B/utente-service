package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.pagamento.Cassa;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class CassaDto extends Dto<Cassa> {

    private String tesoreria;
    private String causale;
}
