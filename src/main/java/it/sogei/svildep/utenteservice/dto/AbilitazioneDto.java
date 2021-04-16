package it.sogei.svildep.utenteservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class AbilitazioneDto extends SvildepDto {

    private String utenteId;
    private String rtsId;
    private String ruolo;
    private String dataInizioValidita;
    private String dataFineValidita;
    private String codiceFiscale;

}
