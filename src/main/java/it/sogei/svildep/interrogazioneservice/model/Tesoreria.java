package it.sogei.svildep.interrogazioneservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tesoreria implements Entity {

    private Long id;
    private String codice;
    private TipoConto tipoConto;
    private String numeroConto;

    public enum TipoConto {
        A, B, C;
    }
}
