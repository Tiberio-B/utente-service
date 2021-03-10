package it.sogei.svildep.istanzaservice.dto.istanza;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DecretoSvincoloReintroitoDto extends IstanzaDto {

    public DecretoSvincoloReintroitoDto() {
        super();
        this.setCategoriaDeposito("DECRETO_SVINCOLO_REINTROITO");
    }
}
