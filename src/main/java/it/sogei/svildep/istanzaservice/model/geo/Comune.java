package it.sogei.svildep.istanzaservice.model.geo;

import it.sogei.svildep.istanzaservice.model.Entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Comune implements Entity {

    private Long id;
}
