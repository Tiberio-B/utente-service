package it.sogei.svildep.istanzaservice.model.pagamento;


import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter

public class ContabilitaSpeciale extends ModalitaPagamento {

    private String sezioneTesoreria;
    private String codiceContabilita;
    private String numeroProvvedimento;
    private LocalDate dataProvvedimento;
    private String enteSvincolante;
    private String tipoEnteSvincolante;
    private Boolean associazioneEsistente;
}
