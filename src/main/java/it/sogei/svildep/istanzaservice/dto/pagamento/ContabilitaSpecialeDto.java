package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.pagamento.ContabilitaSpeciale;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContabilitaSpecialeDto extends Dto<ContabilitaSpeciale> {

    private String sezioneTesoreria;
    private String codiceContabilita;
    private String numeroProvvedimento;
    private String dataProvvedimento;
    private String enteSvincolante;
    private String tipoEnteSvincolante;
    private String associazioneEsistente;
}
