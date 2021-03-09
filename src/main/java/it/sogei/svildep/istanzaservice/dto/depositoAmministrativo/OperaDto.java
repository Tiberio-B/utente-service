package it.sogei.svildep.istanzaservice.dto.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.dto.Dto;
import it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo.Opera;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OperaDto extends Dto<Opera> {

    private String descrizione;
    private String regione;
}
