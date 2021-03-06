package it.sogei.svildep.utenteservice.service.external;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.sogei.svildep.utenteservice.dto.AbilitazioneDto;
import it.sogei.svildep.utenteservice.dto.MessageDto;
import it.sogei.svildep.utenteservice.exception.Messages;
import it.sogei.svildep.utenteservice.exception.SvildepException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Service
@Getter
@RequiredArgsConstructor
public class PortaleServiziDag implements ExternalService {

	private final RestTemplate restTemplate;
	
    @Override
    public String getURL() { return "http://localhost:8080/svildep/api/portaleServiziDag"; }

    public MessageDto comunicaChiusuraAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
        MessageDto response;
        // response = getRestTemplate().exchange(getURL() + "/chiusuraAbilitazione", HttpMethod.POST, new HttpEntity<>(abilitazioneDto), MessageDto.class).getBody();
        response = new MessageDto(Messages.comunicaChiusuraAbilitazione, HttpStatus.OK);
        if (response.isError()) throw new SvildepException(response);
        return response;
    }

    public MessageDto comunicaAperturaAbilitazione(AbilitazioneDto abilitazioneDto) throws SvildepException {
        MessageDto response;
        // response = getRestTemplate().exchange(getURL() + "/aperturaAbilitazione", HttpMethod.POST, new HttpEntity<>(abilitazioneDto), MessageDto.class).getBody();
        response = new MessageDto(Messages.comunicaAperturaAbilitazione, HttpStatus.OK);
        if (response.isError()) throw new SvildepException(response);
        return response;
    }


}
