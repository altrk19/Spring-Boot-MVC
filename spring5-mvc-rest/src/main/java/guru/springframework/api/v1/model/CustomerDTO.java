package guru.springframework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private String firstname;
    private String lastname;

    @JsonProperty("customer_url")
    private String customerUrl;
}

//Client'a response döndüğümüz obje'de resourceUrl var. Bu field DTO objesine ait özel olarak tanımlanmıştır.
// Db'ye kaydettigimiz DAO objesinde yoktur.