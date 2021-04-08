package it.sogei.svildep.utenteservice.mapper;

import it.sogei.svildep.utenteservice.dto.UtenteInsertDto;
import it.sogei.svildep.utenteservice.model.Utente;

public class InsertUtenteMapper implements DtoToEntityMapper<Utente, UtenteInsertDto> {

	@Override
	public Utente mapDtoToEntityImpl(UtenteInsertDto dto) throws RuntimeException {
		
		Utente utente = new Utente();
		utente.setNome(dto.getNome());
		utente.setCognome(dto.getCognome());
		utente.setCodiceFiscale(dto.getCodiceFiscale());
		
		return utente; 
	}

	

}