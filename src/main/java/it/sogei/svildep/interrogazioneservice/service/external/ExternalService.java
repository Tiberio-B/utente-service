package it.sogei.svildep.interrogazioneservice.service.external;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.client.RestTemplate;

@Getter
@AllArgsConstructor
public abstract class ExternalService {

    private final RestTemplate restTemplate;

    public abstract String getURL();
}
