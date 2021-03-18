# 2.1.28	MFN029 - Gestione Utenti
Lo scopo della funzione è quello di gestire l’abilitazione degli utenti con ruolo “Operatore RTS” ed il “Direttore RTS” ad essere abilitato ad operare su una RTS. La funzionalità è abilitata ad utenti con ruolo “Amministratore”. 

## 2.1.28.1	Ricerca abilitazioni Utente
I filtri di ricerca sono posizionati in una sezione minimizzabile in testa alla pagina. Nessun criterio sarà obbligatorio. 
 
### Filtri di ricerca: 
* Codice fiscale 
* Cognome 
* Nome
* Ruolo (COMBO)
* RTS (COMBO)

Sotto la sezione legata ai filtri saranno presenti due pulsanti; uno permetterà di ripulire i filtri di ricerca e l’altro per attivare la ricerca e produrre la lista degli utenti RTS di SVILDEP. 
Sarà possibile attivare attraverso il tasto nuova abilitazione.

## 2.1.28.2	Visualizzazione Lista Abilitazioni utente
Alla pressione del pulsante “Cerca” verrà effettuata la ricerca e presentato in forma tabellare un elenco paginato dei risultati ottenuti tramite i filtri di ricerca impostati.
Per ogni elemento dell’elenco verrà mostrato un set predefinito di dati e sarà possibile eseguire delle azioni che verranno descritte nei paragrafi successivi. 
La lista presenterà i seguenti campi:

### Informazioni elenco:

* Codice fiscale 
* Cognome 
* Nome
* Ruolo 
* RTS 
* Data inizio
* Data fine.

### Per ciascun elemento in lista sarà disponibile la funzione:

* Chiudi (visualizzabile per le abilitazioni aperte)
* Modifica (visualizzabile per le abilitazioni aperte).

Sarà possibile, inoltre, esportare in formato PDF o Excel l’elenco completo dei risultati.

## 2.1.28.3	Inserimento Abilitazione
La funzione “Inserimento Abilitazione” consentirà all’Amministratore di inserire una nuova abilitazione nel sistema.
L’utente cliccherà il pulsante “Nuova Abilitazione”, compilerà i campi obbligatori presenti e cliccherà il pulsante “Salva”.

### I campi disponibili saranno i seguenti:

* Codice fiscale utente
* Ruolo (COMBO) – Significativa solo per i ruoli: Operatore RTS e Direttore RTS
* RTS (COMBO) 

### A fronte del tasto “Salva” il sistema effettuerà le seguenti azioni:
1.	Verifica se l’utente sia già presente nel sistema con abilitazione aperta (altrimenti messaggio che non si può procedere)
2.	Attivazione di un servizio del Portale Servizi DAG per comunicare l’abilitazione in maniera da poter attivare successivamente i relativi servizi messi a disposizione. 
3.	Inserimento in SVILDEP dell’abilitazione del soggetto per il ruolo sulla RTS richiesta.

Il nuovo elemento inserito sarà ora disponibile nella lista delle abilitazioni.

## 2.1.28.4	Chiusura Abilitazione
La funzione “Chiusura Abilitazione” attivabile dalla lista delle abilitazioni consentirà all’Amministratore di chiudere un’abilitazione aperta.
L’utente cliccherà il pulsante “Chiusura Abilitazione”, compilerà la data fine dell’abilitazione e cliccherà il pulsante “Salva”. A fronte del tasto “Salva” il sistema aggiornerà la data fine dell’abilitazione e richiamerà il servizio del Portale Servizi DAG per comunicare la chiusura dell’abilitazione. 

## 2.1.28.5	Modifica Abilitazione
La funzione “Modifica Abilitazione” attivabile dalla lista delle abilitazioni consentirà all’Amministratore di modificare la RTS presente di un’abilitazione aperta.
L’utente cliccherà il pulsante “Modifica Abilitazione”, sceglierà la nuova RTS attraverso una combo e cliccherà il pulsante “Salva”. A fronte del tasto “Salva” il sistema chiuderà l’abilitazione sulla precedente RTS ed inserirà una nuova abilitazione sulla RTS richiesta.
