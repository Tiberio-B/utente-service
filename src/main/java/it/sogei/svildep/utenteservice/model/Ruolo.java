package it.sogei.svildep.utenteservice.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@Getter @Setter

public class Ruolo extends BaseEntity {

	private static final long serialVersionUID = -5232740987772913799L;
	
	
	@EqualsAndHashCode.Include
    private Long id;
    private String ruolo;
}
