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

    String invalidStartDateCode = "invalidStartDate";
    String invalidStartDateMessage = "Il campo 'data inizio' non è una data valida.";

    String invalidEndDateCode = "invalidEndDate";
    String invalidEndDateMessage = "Il campo 'data fine' non è una data valida.";
}
