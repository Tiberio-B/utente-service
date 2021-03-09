package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Rts;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RtsDto extends Dto<Rts> {

    private Long id;
}
