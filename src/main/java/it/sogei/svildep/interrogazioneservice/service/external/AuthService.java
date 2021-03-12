package it.sogei.svildep.interrogazioneservice.service.external;

import it.sogei.svildep.interrogazioneservice.dto.UserDto;
import it.sogei.svildep.interrogazioneservice.exception.AuthorizationException;
import it.sogei.svildep.interrogazioneservice.model.Role;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AuthService extends ExternalService {

    AuthService(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    String getURL() { return "http://localhost:8080/svildep/api/auth"; }

    private String urlAuthUser() { return getURL() + "/authUser"; }

    public UserDto getAuthorizedUserReal(String token, Role... requiredRoles) throws AuthorizationException {
        HttpEntity request = setRequestAuthorization(token, requiredRoles);
        UserDto userDTO = getRestTemplate().exchange(urlAuthUser(), HttpMethod.GET, request, UserDto.class).getBody();
        if (userDTO == null) throw new AuthorizationException();
        return userDTO;
    }

    private HttpEntity setRequestAuthorization(String token, Role... requiredRoles){
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        headers.set("requiredRoles", Role.toString(requiredRoles));
        return new HttpEntity(headers);
    }

    public UserDto getAuthorizedUser(String token, Role... requiredRoles) throws AuthorizationException {
        return new UserDto("tiberio", "OPERATORE_RTS_ROLE");
    }

}
