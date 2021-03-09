package it.sogei.svildep.istanzaservice.model;


import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter

public class Richiesta implements Entity {

    private Long id;

    private LocalDateTime data;
}
