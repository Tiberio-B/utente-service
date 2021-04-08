package it.sogei.svildep.utenteservice.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Utente extends BaseEntity {
	
	private static final long serialVersionUID = -2790597196696392281L;
	
	
	private Long id;
	private String nome; 
    private String cognome; 
	private String codiceFiscale;
	private LocalDate dataInizio; 
	private LocalDate dataFine; 
	private FlagSN flagAbilitazione; 
	private Ruolo ruolo; 
	private Rts rts;
	private String titolo;
	
}
