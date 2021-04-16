package it.sogei.svildep.utenteservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class UtenteDto extends SvildepDto {

    @NotNull
	private String id;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String abilitato;
    private String ruoloId;
    private String rtsId;
    private String dataInizioValidita;
    private String dataFineValidita;

}
