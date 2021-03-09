package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Catasto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class CatastoDto extends Dto<Catasto> {

    private String tipo;
    private String sezioneUrbana;
    private String foglio;

    private String subalterno;
    private String particella;

    private String provincia;
    private String comune;
}
