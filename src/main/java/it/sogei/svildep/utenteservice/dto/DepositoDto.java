package it.sogei.svildep.utenteservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
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
