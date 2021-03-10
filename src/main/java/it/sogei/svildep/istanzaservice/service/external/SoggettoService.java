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
public class SoggettoService extends ExternalService {

    SoggettoService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    String getURL() { return "http://localhost:8080/svildep/api/soggetto"; }

    public MessageDto verificaSoggetti(SoggettoDto... soggetti) {
        HttpEntity<SoggettoDto[]> request = new HttpEntity<>(soggetti);
        return getRestTemplate().exchange(getURL(), HttpMethod.POST, request, MessageDto.class).getBody();
    }

    public MessageDto verificaSoggettiMock(SoggettoDto... soggetti) {
        return new MessageDto("OK", HttpStatus.OK);
    }

}
