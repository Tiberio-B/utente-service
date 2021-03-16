package it.sogei.svildep.interrogazioneservice.util;

import it.sogei.svildep.interrogazioneservice.dto.DepositoDto;
import it.sogei.svildep.interrogazioneservice.dto.RtsDto;
import it.sogei.svildep.interrogazioneservice.dto.TesoreriaDto;

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

	public int nextInt(int min, int max) {
		return (nextInt(max - min + 1) + min);
	}

	public boolean coinFlip() {
		return (nextInt(2) > 0) ? true : false;
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
		int giorno = nextInt(giornoMin, giornoMax);
		int mese = nextInt(meseMin, meseMax);
		int anno = nextInt(annoMin, annoMax);
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

	public DepositoDto depositoCasuale() {
		return DepositoDto.builder()
				.cf(stringaCasuale())
				.tipoDiritto(stringaCasuale())
				.categoria(stringaCasuale())
				.causale(stringaCasuale())
				.numeroNazionale(stringaCasuale())
				.rts(stringaCasuale())
				.importo(stringaCasuale())
				.stato(stringaCasuale())
				.dataCostituzione(stringaCasuale())
				.bpf(stringaCasuale())
				.fondiIncamerati(stringaCasuale())
				.build();
	}

	public TesoreriaDto tesoreriaCasuale() {
		return TesoreriaDto.builder()
				.codice(stringaCasuale())
				.tipoConto(stringaCasuale())
				.numeroConto(stringaCasuale())
				.build();
	}

	public RtsDto rtsCasuale() {
		return RtsDto.builder()
				.nome(stringaCasuale())
				.build();
	}
}
