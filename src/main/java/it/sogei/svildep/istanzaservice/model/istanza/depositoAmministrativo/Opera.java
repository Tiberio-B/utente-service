package it.sogei.svildep.istanzaservice.model.istanza.depositoAmministrativo;

import it.sogei.svildep.istanzaservice.model.Entity;
import it.sogei.svildep.istanzaservice.model.geo.Regione;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Opera implements Entity {

    private Long id;

    private String descrizione;
    private Regione regione;
}
