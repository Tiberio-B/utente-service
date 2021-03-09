package it.sogei.svildep.istanzaservice.dto.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.CatastoDto;
import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.Bene;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class BeneDto extends Dto<Bene> {

    private CatastoDto datiCatastali;
    private Set<SoggettoDto> proprietariCatastali;
}
