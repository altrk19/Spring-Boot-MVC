package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;

import java.util.List;

public interface ApiService {
    User getUser(String userId);
    List<User> getAllUsers();
}
