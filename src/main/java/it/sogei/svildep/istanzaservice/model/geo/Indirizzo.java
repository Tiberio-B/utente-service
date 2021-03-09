package it.sogei.svildep.istanzaservice.model.geo;

import it.sogei.svildep.istanzaservice.model.Entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Indirizzo implements Entity {

    private Long id;

    Nazione nazione;
    Provincia provincia;
    Comune comune;
    String cap;
    String indirizzo;
    String civico;
}
