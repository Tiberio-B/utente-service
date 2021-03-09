package it.sogei.svildep.istanzaservice.dto.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.Opera;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class OperaDto extends Dto<Opera> {

    private String descrizione;
    private String regione;
}
