package it.sogei.svildep.interrogazioneservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositoDto extends Dto {

    private String cf;
    private String tipoDiritto;
    private String categoria;
    private String causale;
    private String numeroNazionale;
    private String rts;
    private String importo;
    private String stato;
    private String dataCostituzione;
    private String bpf;
    private String fondiIncamerati;
}
