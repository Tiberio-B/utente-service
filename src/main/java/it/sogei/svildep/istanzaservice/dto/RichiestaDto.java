package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Richiesta;

import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter

public class RichiestaDto extends Dto<Richiesta> {

    private String data;
}
