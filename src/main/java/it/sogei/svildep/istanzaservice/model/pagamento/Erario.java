package it.sogei.svildep.istanzaservice.model.pagamento;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Erario extends ModalitaPagamento {

    private String indicatore;
    private String secione;
    private String capoImputazioneEntrata;
    private String capitoloEntrata;
    private String articoloEntrata;
}
