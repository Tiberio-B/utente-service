package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
public abstract class Dto {

	public static final String INCOMPATIBLE_DTO = "Incompatible DTO";
	public static final String INVALID_ID = "Invalid ID";
	public static final String NOT_A_DTO = "Not a DTO";

	private String id;
	
	@Accessors(fluent = true)
	private boolean hasErrors = false;
}
