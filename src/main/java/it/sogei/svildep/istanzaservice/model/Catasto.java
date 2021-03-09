package it.sogei.svildep.istanzaservice.model;

import it.sogei.svildep.istanzaservice.model.geo.Comune;
import it.sogei.svildep.istanzaservice.model.geo.Provincia;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Catasto implements Entity {

    private Long id;

    private String tipo;
    private String sezioneUrbana;
    private String foglio;

    private String subalterno;
    private String particella;

    private Provincia provincia;
    private Comune comune;
}
