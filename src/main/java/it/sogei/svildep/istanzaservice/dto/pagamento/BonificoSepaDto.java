package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.geo.NazioneDto;
import it.sogei.svildep.istanzaservice.model.pagamento.BonificoSepa;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BonificoSepaDto extends Dto<BonificoSepa> {

    private NazioneDto paeseAreaSepa;
    private String iban;
}
