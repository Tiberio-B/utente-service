package it.sogei.svildep.interrogazioneservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TesoreriaDto extends Dto {

    private String codice;
    private String tipoConto;
    private String numeroConto;

}
