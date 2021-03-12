package it.sogei.svildep.interrogazioneservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Soggetto implements Entity {

    private Long id;

    private String nome;
    private String cognome;
    private String cf;
    private Sesso sesso;
    private String partitaIva;

    public enum Sesso {
        M, F, X;
    }
}
