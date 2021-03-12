# 2.1.37	Servizi Interrogazione SVILDEP
Si riportano i servizi previsti per essere richiamati dal Portale servizi DAG:

## 2.1.37.1	Servizio lista depositi per soggetto

### INPUT
* Codice fiscale Soggetto    

### OUTPUT
In output ci sarà la lista dei depositi su cui il Soggetto possiede un diritto anche per delega. 

* Codice fiscale Soggetto
* Tipo diritto Soggetto
* Codice fiscale Soggetto associato attraverso il tipo diritto
* Categoria del deposito con informazione su Esproprio
* Causale/Descrizione del deposito
* Numero Nazionale
* Numero RTS competente
* Importo del deposito
* Stato del deposito 
* Data di costituzione del deposito
* BPF (SI/NO)
* Fondi Incamerati (SI/NO)

## 2.1.37.2	Servizio lista RTS

### INPUT
* Nessuno

### OUTPUT

In output ci sarà la lista delle RTS con le seguenti informazioni:

* Codice fiscale
* Denominazione RTS
* Provincia Competenza RTS.

## 2.1.37.3	Servizio Visualizzazione deposito per numero (anche per controllo di esistenza)

### INPUT
* Numero nazionale Deposito

### OUTPUT
In output saranno ritornate le informazioni di un deposito che verranno concordate.

## 2.1.37.4	Servizio Lista Tesorerie

### INPUT
* Nessuno

### OUTPUT
In output ci sarà la lista delle Tesorerie con le seguenti informazioni:

* Codice Tesoreria
* Denominazione Tesoreria.

## 2.1.37.5	Servizio Lista Conti per Tesoreria

### INPUT
* Codice Tesoreria

### OUTPUT
In output ci sarà la lista dei Conti di Tesoreria con le seguenti informazioni:

* Codice Tesoreria
* Tipo Conto 
* Numero Conto.
