package it.sogei.svildep.utenteservice.exception;

public interface Messages {

    String erroreGenerico = "MESSAGGIO D'ERRORE DA SCRIVERE.";

    String categoriaDeposito = "E' necessario specificare la categoria deposito.";
    String tipoIstanza = "E' necessario specificare il tipo di istanza.";

    String idRTSInoltro = "Errore id RTS per inoltro.";

    String inserimento = "Inserimento effettuato con successo.";

    String numeroRichiesta = "E' necessario specificare il numero della richiesta.";

    String enteCauzionato = "E' necessario specificare l'ente richiedente.";
    String qualitaRichiedente = "E' necessario specificare la qualita' del richiedente.";
    String richiedente = "E' necessario specificare il richiedente.";

    String datiCatastali = "E' necessario specificare i dati catastali.";
    String proprietariCatastali = "E' necessario specificare almeno un proprietario catastale";
    String tipoCatasto = "E' necessario specificare il tipo del catasto.";
    String sezioneUrbana = "E' necessario specificare la sezione urbana.";
    String foglioCatasto = "E' necessario specificare il foglio del catasto.";
    String subalternoCatasto = "E' necessario specificare il subalterno del catasto.";
    String particellaCatasto = "E' necessario specificare la particella del catasto.";

    String provincia = "E' necessario specificare la provincia.";
    String comune = "E' necessario specificare il comune.";

    String causaleDeposito = "E' necessario specificare la causale del deposito.";
    String importoDeposito = "E' necessario specificare l'importo del deposito.";

    String numeroProtocollo = "E' necessario specificare il numero del protocollo.";
    String dataProtocollo = "E' necessario specificare la data del protocollo";

    String dataRichiesta = "E' necessario specificare la data della richiesta.";

    String descrizioneOpera = "E' necessario specificare la descrizione dell'opera.";
    String tipoSoggetto = "E' necessario specificare il tipo soggetto";

    String invalidDtoCode = "invalidDto";
    String invalidDtoMessage = "Il corpo della richiesta non è un DTO valido.";

    String invalidIdCode = "invalidId";
    String invalidIdMessage = "L'id acquisito non è un numero valido.";

    String invalidDateCode = "invalidDate";
    String invalidDateMessage = "La data specificata non è una data valida.";

    String invalidSessoCode = "invalidSesso";
    String invalidSessoMessage = "Il sesso specificato non è valido.";

    String invalidTipoCode = "invalidTipo";
    String invalidTipoMessage = "Il tipo specificato non è valido.";

    String invalidCategoriaCode = "invalidCategoria";
    String invalidCategoriaMessage = "La categoria specificata non è valida.";

    String invalidQualitaRichiedenteCode = "invalidQualitaRichiedente";
    String invalidQualitaRichiedenteMessage = "La qualita' richiedente specificata non è valida.";

    String invalidStatoCode = "invalidStato";
    String invalidStatoMessage = "Lo stato specificato non è valido.";

    String proprietario = "Dati proprietario non validi.";
    String versante = "Dati versante non validi.";
    
    String nonAutorizzato = "L'utente corrente non è autorizzato ad eseguire l'operazione.";

    String nuovaAbilitazione = "La nuova abilitazione è stata inserita con successo.";
    String chiusuraAbilitazione = "L'abilitazione è stata chiusa con successo.";
    String modificaAbilitazione = "L'abilitazione è stata modificata con successo.";

    String comunicaChiusuraAbilitazione = "Comunica chiusura abilitazione effettuata con successo.";
    String comunicaAperturaAbilitazione = "Comunica apertura abilitazione effettuata con successo.";


    String invalidStartDateCode = "invalidStartDate";
    String invalidStartDateMessage = "Il campo 'data inizio' non è una data valida.";

    String invalidEndDateCode = "invalidEndDate";
    String invalidEndDateMessage = "Il campo 'data fine' non è una data valida.";
    
    String operazioneRiuscita = "Operazione riuscita.";
    String codiceFiscaleNonValido = "Codice fiscale non valido.";
    
    String utenteGiaAbilitato = "l'utente selezionato è già abilitato";
    String utenteInesistente = "l'utente cercato non esiste!!";
    
    String validazioneCf = "\r\n"
	   		+ "/^(?:[A-Z][AEIOU][AEIOUX]|[B-DF-HJ-NP-TV-Z]{2}[A-Z]){2}(?:[\\dLMNP-V]{2}(?:[A-EHLMPR-T](?:[04LQ][1-9MNP-V]|[15MR][\\dLMNP-V]|[26NS][0-8LMNP-U])|[DHPS][37PT][0L]|[ACELMRT][37PT][01LM]|[AC-EHLMPR-T][26NS][9V])|(?:[02468LNQSU][048LQU]|[13579MPRTV][26NS])B[26NS][9V])(?:[A-MZ][1-9MNP-V][\\dLMNP-V]{2}|[A-M][0L](?:[1-9MNP-V][\\dLMNP-V]|[0L][1-9MNP-V]))[A-Z]$/i\r\n"
	   		+ "1\r\n"
	   		+ "/^(?:[A-Z][AEIOU][AEIOUX]|[B-DF-HJ-NP-TV-Z]{2}[A-Z]){2}(?:[\\dLMNP-V]{2}(?:[A-EHLMPR-T](?:[04LQ][1-9MNP-V]|[15MR][\\dLMNP-V]|[26NS][0-8LMNP-U])|[DHPS][37PT][0L]|[ACELMRT][37PT][01LM]|[AC-EHLMPR-T][26NS][9V])|(?:[02468LNQSU][048LQU]|[13579MPRTV][26NS])B[26NS][9V])(?:[A-MZ][1-9MNP-V][\\dLMNP-V]{2}|[A-M][0L](?:[1-9MNP-V][\\dLMNP-V]|[0L][1-9MNP-V]))[A-Z]$/i";
    
    
}
