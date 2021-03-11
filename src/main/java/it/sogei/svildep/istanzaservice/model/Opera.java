package it.sogei.svildep.istanzaservice.model;

import it.sogei.svildep.istanzaservice.model.Entity;
import it.sogei.svildep.istanzaservice.model.geo.Regione;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Opera implements Entity {

    private Long id;

    private String descrizione;
    private Regione regione;
}
