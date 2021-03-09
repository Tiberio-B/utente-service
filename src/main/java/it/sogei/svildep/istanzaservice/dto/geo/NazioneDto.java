package it.sogei.svildep.istanzaservice.dto.geo;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.geo.Nazione;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class NazioneDto extends Dto<Nazione> {

    private String areaSepa;
    private String nome;
}
