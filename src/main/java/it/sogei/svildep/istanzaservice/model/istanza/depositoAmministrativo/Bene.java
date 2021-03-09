package it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.model.Catasto;
import it.sogei.svildep.istanzaservice.model.Entity;
import it.sogei.svildep.istanzaservice.model.Soggetto;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Bene implements Entity {

    private Long id;

    private Catasto datiCatastali;
    private Set<Soggetto> proprietariCatastali;
}
