package it.sogei.svildep.utenteservice.service.external;

import it.sogei.svildep.utenteservice.dto.UtenteDto;
import it.sogei.svildep.utenteservice.exception.AuthorizationException;
import it.sogei.svildep.utenteservice.util.GeneratoreCasuale;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthService extends ExternalService {

    AuthService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public String getURL() { return "http://localhost:8080/svildep/api/auth"; }

    public UtenteDto ottieniUtenteAutorizzatoMock(String token, Role... requiredRoles) throws AuthorizationException {
        // UtenteDto userDto = getRestTemplate().exchange(getURL(), HttpMethod.GET, setRequestAuthorization(token, requiredRoles), UserDto.class).getBody();
        UtenteDto utenteDto = UtenteDto.builder()
                .nome("Pippo")
                .cognome("Baudo")
                .cf("PPPBDO0123456789")
                .dataInizioValidita("inizioValidita")
                .dataFineValidita("fineValidita")
                .ruolo(Role.ADMIN_ROLE.toString())
                .rtsId("999")
                .build();
        if (utenteDto == null) throw new AuthorizationException();
        return utenteDto;
    }

    private HttpEntity setRequestAuthorization(String token, Role... requiredRoles){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        headers.set("requiredRoles", Role.toString(requiredRoles));
        return new HttpEntity(headers);
    }

    public enum Role {

        ADMIN_ROLE, UTENTE_ROLE;

        public static String toString(Role[] roles) {
            StringBuilder sb = new StringBuilder();
            for (Role role : roles) sb.append(role.name()).append(",");
            return sb.toString();
        }
    }

}
