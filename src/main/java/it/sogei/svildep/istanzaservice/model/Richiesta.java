package it.sogei.svildep.istanzaservice.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Richiesta implements Entity {

    private Long id;

    private LocalDateTime data;
}
