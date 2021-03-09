package it.sogei.svildep.istanzaservice.dto.istanza;

import it.sogei.svildep.istanzaservice.dto.DepositoDto;
import it.sogei.svildep.istanzaservice.dto.DocumentoDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class IstanzaRestituzioneDepositoDto extends IstanzaDto {

    private String importoRichiesto;

    private Set<SoggettoDto> soggettiObbligatori;
    private SoggettoDto intestatario;

    private String pagamentoASoggettiDeposito;

    private String modalitaPagamento;

    private Set<DocumentoDto> allegati;

    IstanzaRestituzioneDepositoDto(SoggettoDto richiedente, DepositoDto datiDeposito) {
        super(richiedente, datiDeposito, "DEPOSITO_AMMINISTRATIVO");
    }
}
