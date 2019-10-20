package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("tr")
public class PrimaryTurkishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Merhaba - Turkce Profil PrimaryTurkishGreetingService";
    }
}
