package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;

    @Lob
    private String directions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients = new HashSet<>();

    @Lob         //image length can be large       //blob:binary lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)    //if we delete recipe, we want to delete notes too
    private Notes notes;

    @Enumerated(value = EnumType.STRING)    //default behave is ORDINAL, it saves the number of enum to database
    private Difficulty difficulty;

    @ManyToMany
    @JoinTable(name = "recipe_category",
        joinColumns = @JoinColumn(name = "recipe_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();
}
