package it.sogei.svildep.istanzaservice.model;


import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter

public class Protocollo implements Entity {

    private Long id;

    private Long numero;
    private LocalDateTime data;
}
