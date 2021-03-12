package it.sogei.svildep.interrogazioneservice.service.external;

import lombok.Getter;
import org.springframework.web.client.RestTemplate;

@Getter
public abstract class ExternalService {

    private final RestTemplate restTemplate;

    ExternalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    abstract String getURL();
}
