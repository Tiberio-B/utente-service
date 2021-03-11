package it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.model.Catasto;
import it.sogei.svildep.istanzaservice.model.Entity;
import it.sogei.svildep.istanzaservice.model.Soggetto;

import lombok.Getter;
import lombok.Setter;


import java.util.Set;

@Getter
@Setter
public class Bene implements Entity {

    private Long id;

    private Catasto datiCatastali;
    private Set<Soggetto> proprietariCatastali;
}
