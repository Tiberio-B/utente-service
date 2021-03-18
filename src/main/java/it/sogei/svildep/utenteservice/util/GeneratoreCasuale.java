package it.sogei.svildep.utenteservice.util;

import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.service.external.AuthService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class GeneratoreCasuale extends Random {

	private static final long serialVersionUID = 1L;

	private <T> T elementoCasuale(T[]... arrays) {
		List<T> lista = new ArrayList<>();
		for (T[] array : arrays) {
			for (T t : array) {
				lista.add(t);
			}
		}
		return elementoCasuale(lista);
	}
	
	private <T> T elementoCasuale(T[] array) {
		return array[nextInt(array.length)];
	}

	public <T> T elementoCasuale(List<T> lista) {
		return lista.get(nextInt(lista.size()));
	}

	public Integer nextInteger(int min, int max) {
		return (nextInt(max - min + 1) + min);
	}

	public Boolean coinFlip() {
		return nextInt(2) > 0;
	}

	public String nomeCasuale() {
		return elementoCasuale(LoremIpsum.NOMI);
	}

	public String cognomeCasuale() {
		return elementoCasuale(LoremIpsum.COGNOMI);
	}
	
	public String nomeCompletoCasuale() {
		return nomeCasuale() + " " + cognomeCasuale();
	}

	@SuppressWarnings("deprecation")
	Date dataCasuale(int giornoMin, int giornoMax, int meseMin, int meseMax, int annoMin,
			int annoMax) {
		int giorno = nextInteger(giornoMin, giornoMax);
		int mese = nextInteger(meseMin, meseMax);
		int anno = nextInteger(annoMin, annoMax);
		return new Date(anno - 1900, mese - 1, giorno);
	}
	
	Date dataCasuale() {
		return dataCasuale(1, 28, 1, 12, 2000, 2020);
	}

	public String stringaCasuale() {
		return elementoCasuale(LoremIpsum.VCVCVCV);
	}

	public String cittaCasuale() {
		return elementoCasuale(LoremIpsum.CITTA);
	}

	public UtenteDto utenteCasuale(int id) {
		return UtenteDto.builder()
				.id(String.valueOf(id))
				.cf(stringaCasuale())
				.nome(nomeCasuale())
				.cognome(cognomeCasuale())
				.dataInizioValidita(dataCasuale().toString())
				.dataFineValidita(dataCasuale().toString())
				.abilitato(coinFlip().toString())
				.ruolo(AuthService.Role.UTENTE_ROLE.toString())
				.rtsId(nextInteger(0, 100).toString())
				.build();
	}
}
