package it.sogei.svildep.istanzaservice.model.pagamento;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Erario extends ModalitaPagamento {

    private String indicatore;
    private String secione;
    private String capoImputazioneEntrata;
    private String capitoloEntrata;
    private String articoloEntrata;
}
