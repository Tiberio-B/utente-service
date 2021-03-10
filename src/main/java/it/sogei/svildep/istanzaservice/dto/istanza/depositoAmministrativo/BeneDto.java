package it.sogei.svildep.istanzaservice.dto.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.CatastoDto;
import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.Bene;

import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter

public class BeneDto extends Dto {

    @NotNull
    private CatastoDto datiCatastali;
    @NotEmpty
    private Set<SoggettoDto> proprietariCatastali;
}
