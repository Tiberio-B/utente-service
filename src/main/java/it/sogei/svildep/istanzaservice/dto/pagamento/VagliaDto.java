package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.geo.IndirizzoDto;
import it.sogei.svildep.istanzaservice.model.pagamento.Vaglia;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VagliaDto extends Dto<Vaglia> {

    private String cognomeDestinatario;
    private String nomeDestinatario;
    private IndirizzoDto indirizzo;
}
