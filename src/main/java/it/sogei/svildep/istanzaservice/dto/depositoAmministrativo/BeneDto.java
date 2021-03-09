package it.sogei.svildep.istanzaservice.dto.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.CatastoDto;
import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.Bene;

import lombok.Getter;
import lombok.Setter;


import java.util.Set;

@Getter
@Setter

public class BeneDto extends Dto<Bene> {

    private CatastoDto datiCatastali;
    private Set<SoggettoDto> proprietariCatastali;
}
