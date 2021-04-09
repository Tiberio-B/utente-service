package it.sogei.svildep.utenteservice.repository;

import it.sogei.svildep.utenteservice.model.Ruolo;
import it.sogei.svildep.utenteservice.model.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RuoloRepository extends JpaRepository<Ruolo,Long> {

}
