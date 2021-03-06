package it.sogei.svildep.utenteservice.service.external;

import it.sogei.svildep.utenteservice.dto.UtenteAnagraficaDto;
import it.sogei.svildep.utenteservice.service.external.ExternalService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Getter
public class AnagrafeUnicaAdapter implements ExternalService {
	
	  private final RestTemplate restTemplate;
	  
	    @Value("${anagrafe-service-url}")
	    private String URL;

	    @Value("${anagrafe-service-utenti-path}")
	    private String PATH_UTENTI;

	  //Aggiungere controllo sul tipo di ritorno (optional User) se non torna nulla lo blocco qui e aggiungo messaggio

	  public UtenteAnagraficaDto searchUtenteByCf(String codiceFiscale) {

		ResponseEntity<UtenteAnagraficaDto> risposta = restTemplate.exchange(URL + PATH_UTENTI, HttpMethod.POST, new HttpEntity<>(codiceFiscale), UtenteAnagraficaDto.class);
		if(risposta.getStatusCode().isError()){
			return null;
		}
		else {
			return risposta.getBody();
		}

		  /*UtenteAnagraficaDto utente = new UtenteAnagraficaDto();
		  utente.setCodiceFiscale(codiceFiscale);
		  utente.setNome("Arisa");
		  utente.setCognome("Viola");*/

	  }

}
