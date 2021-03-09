package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.geo.IndirizzoDto;
import it.sogei.svildep.istanzaservice.model.pagamento.Vaglia;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class VagliaDto extends Dto<Vaglia> {

    private String cognomeDestinatario;
    private String nomeDestinatario;
    private IndirizzoDto indirizzo;
}
