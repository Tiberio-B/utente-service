package it.sogei.svildep.utenteservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ModificaAbilitazioneDto {
    @NotNull
    private String utenteId;
    private String ruoloId;
    private String rtsId;
}
