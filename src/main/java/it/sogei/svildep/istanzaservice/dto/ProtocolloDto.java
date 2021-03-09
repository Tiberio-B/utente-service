package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Protocollo;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ProtocolloDto extends Dto<Protocollo> {

    private Long id;

    private Long numero;
    private LocalDateTime data;
}
