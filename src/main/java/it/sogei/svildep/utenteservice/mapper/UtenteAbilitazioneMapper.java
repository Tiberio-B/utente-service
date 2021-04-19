package it.sogei.svildep.utenteservice.mapper;

import it.sogei.svildep.utenteservice.dto.AbilitazioneDto;
import it.sogei.svildep.utenteservice.dto.UtenteAnagraficaDto;
import it.sogei.svildep.utenteservice.model.Rts;
import it.sogei.svildep.utenteservice.model.Ruolo;
import it.sogei.svildep.utenteservice.model.Utente;
import it.sogei.svildep.utenteservice.model.enums.FlagSN;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public class UtenteAbilitazioneMapper {

    public Utente mapDtoToEntityImpl(AbilitazioneDto abilitazionedto, UtenteAnagraficaDto utenteAnagrafica) throws RuntimeException {
        return Utente.builder()
                .codiceFiscale(utenteAnagrafica.getCodiceFiscale())
                .nome(utenteAnagrafica.getNome())
                .cognome(utenteAnagrafica.getCognome())
                .flagAbilitazione(FlagSN.S)
                .ruolo(Ruolo.builder()
                        .id(Long.parseLong(abilitazionedto.getRuolo()))
                        .build())
                .rts(Rts.builder()
                        .id(Long.parseLong(abilitazionedto.getRtsId()))
                        .build())
                .build();
    }

    public Utente mapDtoToEntity(AbilitazioneDto abilitazionedto, Utente utente) throws RuntimeException {
        utente.setFlagAbilitazione(FlagSN.S);
        utente.setRuolo(Ruolo.builder()
                .id(Long.parseLong(abilitazionedto.getRuolo()))
                .build());
        utente.setRts(Rts.builder()
                .id(Long.parseLong(abilitazionedto.getRtsId()))
                .build());
        return utente;
    }

}
