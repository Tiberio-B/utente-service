package it.sogei.svildep.istanzaservice.service.external;

import it.sogei.svildep.istanzaservice.dto.UserDto;
import it.sogei.svildep.istanzaservice.exception.AuthorizationException;
import it.sogei.svildep.istanzaservice.model.Role;
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

    public UserDto getAuthorizedUser(String token, Role... requiredRoles) throws AuthorizationException {
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

}
