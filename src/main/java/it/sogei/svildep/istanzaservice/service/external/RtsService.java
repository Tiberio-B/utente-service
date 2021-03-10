package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.dto.DocumentoDto;
import it.sogei.svildep.istanzaservice.dto.MessageDto;
import it.sogei.svildep.istanzaservice.dto.SoggettoDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@Service
public class RtsService extends ExternalService {

    RtsService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    String getURL() { return "http://localhost:8080/svildep/api/rts"; }

    public MessageDto inserimentoInFascicolo(Set<DocumentoDto> documenti) {
        HttpEntity<Set<DocumentoDto>> request = new HttpEntity<>(documenti);
        return getRestTemplate().exchange(getURL(), HttpMethod.POST, request, MessageDto.class).getBody();
    }

    public MessageDto inserimentoInFascicoloMock(Set<DocumentoDto> documenti) {
        return new MessageDto("OK", HttpStatus.OK);
    }

}
