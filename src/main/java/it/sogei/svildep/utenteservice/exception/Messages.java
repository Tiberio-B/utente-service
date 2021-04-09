package it.sogei.svildep.utenteservice.exception;

public interface Messages {

    String erroreGenerico = "MESSAGGIO D'ERRORE DA SCRIVERE.";

    String nonAutorizzato = "L'utente corrente non è autorizzato ad eseguire l'operazione.";

    String nuovaAbilitazione = "La nuova abilitazione è stata inserita con successo.";
    String chiusuraAbilitazione = "L'abilitazione è stata chiusa con successo.";
    String modificaAbilitazione = "L'abilitazione è stata modificata con successo.";

    String comunicaChiusuraAbilitazione = "Comunica chiusura abilitazione effettuata con successo.";
    String comunicaAperturaAbilitazione = "Comunica apertura abilitazione effettuata con successo.";
    
    String operazioneRiuscita = "Operazione riuscita.";
    String codiceFiscaleNonValido = "Codice fiscale non valido.";
    
    String utenteGiaAbilitato = "l'utente selezionato è già abilitato";
    String utenteInesistente = "l'utente cercato non esiste!!";

    String ruoloInesistente = "il ruolo selezionato non esiste";

    String modificaNegata = "non puoi inserire o modificare un'amministratore";
    String validazioneCf = "\r\n"
	   		+ "/^(?:[A-Z][AEIOU][AEIOUX]|[B-DF-HJ-NP-TV-Z]{2}[A-Z]){2}(?:[\\dLMNP-V]{2}(?:[A-EHLMPR-T](?:[04LQ][1-9MNP-V]|[15MR][\\dLMNP-V]|[26NS][0-8LMNP-U])|[DHPS][37PT][0L]|[ACELMRT][37PT][01LM]|[AC-EHLMPR-T][26NS][9V])|(?:[02468LNQSU][048LQU]|[13579MPRTV][26NS])B[26NS][9V])(?:[A-MZ][1-9MNP-V][\\dLMNP-V]{2}|[A-M][0L](?:[1-9MNP-V][\\dLMNP-V]|[0L][1-9MNP-V]))[A-Z]$/i\r\n"
	   		+ "1\r\n"
	   		+ "/^(?:[A-Z][AEIOU][AEIOUX]|[B-DF-HJ-NP-TV-Z]{2}[A-Z]){2}(?:[\\dLMNP-V]{2}(?:[A-EHLMPR-T](?:[04LQ][1-9MNP-V]|[15MR][\\dLMNP-V]|[26NS][0-8LMNP-U])|[DHPS][37PT][0L]|[ACELMRT][37PT][01LM]|[AC-EHLMPR-T][26NS][9V])|(?:[02468LNQSU][048LQU]|[13579MPRTV][26NS])B[26NS][9V])(?:[A-MZ][1-9MNP-V][\\dLMNP-V]{2}|[A-M][0L](?:[1-9MNP-V][\\dLMNP-V]|[0L][1-9MNP-V]))[A-Z]$/i";
    
    
}
