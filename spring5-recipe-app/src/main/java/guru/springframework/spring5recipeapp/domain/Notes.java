package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(exclude = "recipe")
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne            //didnt use cascade. Because we dont want delete recipe if deleted notes
    private Recipe recipe;

    @Lob       //for large objects : string length more than 255   //clob:character lob
    private String recipeNotes;

}
