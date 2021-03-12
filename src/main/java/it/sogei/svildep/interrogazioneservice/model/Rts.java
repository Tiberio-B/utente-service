package it.sogei.svildep.interrogazioneservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rts implements Entity {

    private Long id;
    private String cs;
    private String denominazione;
    private Provincia provincia;
}
