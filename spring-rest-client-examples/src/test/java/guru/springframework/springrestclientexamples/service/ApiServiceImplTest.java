package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Test
    void testGetUser() {
        User user = apiService.getUser("1");
        assertEquals(1, user.getId());
    }

    @Test
    void testGetAllUsers() {
        List<User> users = apiService.getAllUsers();
        assertEquals(10, users.size());
    }
}