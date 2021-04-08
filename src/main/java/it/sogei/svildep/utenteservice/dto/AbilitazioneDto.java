package it.sogei.svildep.utenteservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class AbilitazioneDto extends SvildepDto {

    private String utenteId;
    private String rtsId;
    private String ruolo;
    private String dataInizioValidita;
    private String dataFineValidita;
    private String codiceFiscale;

}
