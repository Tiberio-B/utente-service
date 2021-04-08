package it.sogei.svildep.utenteservice.repository;

import it.sogei.svildep.utenteservice.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente,Long> {

    public Utente findUtenteByCodiceFiscale(String codiceFiscale);


}
