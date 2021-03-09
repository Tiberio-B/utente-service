package it.sogei.svildep.istanzaservice.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Protocollo implements Entity {

    private Long id;

    private Long numero;
    private LocalDateTime data;
}
