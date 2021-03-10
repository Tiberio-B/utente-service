package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.pagamento.Erario;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class ErarioDto extends Dto {

    private String indicatore;
    private String secione;
    private String capoImputazioneEntrata;
    private String capitoloEntrata;
    private String articoloEntrata;
}
