package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.pagamento.TesoreriaUnica;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class TesoreriaUnicaDto extends Dto {

    private String tesoreria;
    private String numeroConto;

}
