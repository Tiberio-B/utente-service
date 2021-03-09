package it.sogei.svildep.istanzaservice.model.pagamento;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ContabilitaSpeciale extends ModalitaPagamento {

    private String sezioneTesoreria;
    private String codiceContabilita;
    private String numeroProvvedimento;
    private LocalDate dataProvvedimento;
    private String enteSvincolante;
    private String tipoEnteSvincolante;
    private Boolean associazioneEsistente;
}
