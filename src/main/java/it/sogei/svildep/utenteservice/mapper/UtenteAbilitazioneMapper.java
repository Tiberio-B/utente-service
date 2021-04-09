package it.sogei.svildep.utenteservice.mapper;

import it.sogei.svildep.utenteservice.dto.AbilitazioneDto;
import it.sogei.svildep.utenteservice.dto.UtenteAnagraficaDto;
import it.sogei.svildep.utenteservice.model.enums.FlagSN;
import it.sogei.svildep.utenteservice.model.Rts;
import it.sogei.svildep.utenteservice.model.Ruolo;
import it.sogei.svildep.utenteservice.model.Utente;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public class UtenteAbilitazioneMapper {


    public Utente mapDtoToEntityImpl(AbilitazioneDto abilitazionedto, UtenteAnagraficaDto utenteAnagrafica) throws RuntimeException {
        Utente utente = new Utente();

        utente.setCodiceFiscale(utenteAnagrafica.getCodiceFiscale());
        utente.setNome(utenteAnagrafica.getNome());
        utente.setCognome(utenteAnagrafica.getCognome());

        utente.setFlagAbilitazione(FlagSN.S);
        Ruolo ruolo = new Ruolo();

        ruolo.setId(Long.parseLong(abilitazionedto.getRuolo()));
        utente.setRuolo(ruolo);

        Rts rts = new Rts();
        rts.setId(Long.parseLong(abilitazionedto.getRtsId()));
        utente.setRts(rts);


        return utente;
    }
    public Utente mapDtoToEntity(AbilitazioneDto abilitazionedto, Utente utente) throws RuntimeException {

        utente.setFlagAbilitazione(FlagSN.S);
        Ruolo ruolo = new Ruolo();

        ruolo.setId(Long.parseLong(abilitazionedto.getRuolo()));
        utente.setRuolo(ruolo);

        Rts rts = new Rts();
        rts.setId(Long.parseLong(abilitazionedto.getRtsId()));
        utente.setRts(rts);


        return utente;
    }



}
