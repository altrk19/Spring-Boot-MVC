package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Slf4j
@Service
public class ApiServiceImpl implements ApiService {
    private RestTemplate restTemplate;
    private final String apiUrl;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }

    @Override
    public User getUser(String userId) {
        User user = null;
        try {
            user = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" + userId, User.class);
        } catch (Exception ex) {
            log.error("Exception occurred", ex);
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        UriComponentsBuilder uriComponentsBuilder =UriComponentsBuilder
                .fromUriString(apiUrl);
        //.queryParam("limit", limit);
        List<User> users = null;
        try {
            users = restTemplate.getForObject(uriComponentsBuilder.toUriString() , List.class);
        } catch (Exception ex) {
            log.error("Exception occurred", ex);
        }
        return users;
    }
}
