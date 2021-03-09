package it.sogei.svildep.istanzaservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Documento implements Entity {

    private Long id;
}
