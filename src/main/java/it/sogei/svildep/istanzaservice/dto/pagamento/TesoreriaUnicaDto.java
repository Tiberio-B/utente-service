package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.pagamento.TesoreriaUnica;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TesoreriaUnicaDto extends Dto<TesoreriaUnica> {

    private String tesoreria;
    private String numeroConto;

}
