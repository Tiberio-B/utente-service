package it.sogei.svildep.istanzaservice.dto.pagamento;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.geo.NazioneDto;
import it.sogei.svildep.istanzaservice.model.pagamento.BonificoSepa;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class BonificoSepaDto extends Dto {

    private NazioneDto paeseAreaSepa;
    private String iban;
}
