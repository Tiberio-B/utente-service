package it.sogei.svildep.utenteservice.exception;

public interface Messages {

    String nonAutorizzato = "L'utente corrente non è autorizzato ad eseguire l'operazione.";

    String nuovaAbilitazione = "La nuova abilitazione è stata inserita con successo.";
    String chiusuraAbilitazione = "L'abilitazione è stata chiusa con successo.";
    String modificaAbilitazione = "L'abilitazione è stata modificata con successo.";

    String comunicaChiusuraAbilitazione = "Comunica chiusura abilitazione effettuata con successo.";
    String comunicaAperturaAbilitazione = "Comunica apertura abilitazione effettuata con successo.";

    String invalidDtoCode = "invalidDto";
    String invalidDtoMessage = "Il corpo della richiesta non è un DTO valido.";


}
