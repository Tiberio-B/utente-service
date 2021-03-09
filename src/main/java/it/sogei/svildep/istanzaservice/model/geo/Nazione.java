package it.sogei.svildep.istanzaservice.model.geo;

import it.sogei.svildep.istanzaservice.model.Entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Nazione implements Entity {

    private Long id;
    private String nome;
    private boolean areaSepa;
}
