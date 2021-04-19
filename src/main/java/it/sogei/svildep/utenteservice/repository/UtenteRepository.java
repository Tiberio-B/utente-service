package it.sogei.svildep.utenteservice.repository;

import it.sogei.svildep.utenteservice.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtenteRepository extends JpaRepository<Utente,Long> {

    Optional<Utente> findUtenteByCodiceFiscale(String codiceFiscale);


}
