package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Richiesta;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class RichiestaDto extends Dto<Richiesta> {

    private Long id;

    private LocalDateTime data;
}
