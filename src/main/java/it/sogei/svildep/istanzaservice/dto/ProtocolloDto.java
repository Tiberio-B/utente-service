package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Protocollo;

import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter
public class ProtocolloDto extends Dto<Protocollo> {

    private String numero;
    private String data;
}
