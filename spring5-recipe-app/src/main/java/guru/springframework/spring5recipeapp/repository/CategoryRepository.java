package guru.springframework.spring5recipeapp.repository;

import guru.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription1(String description);   //Sprind Data JPA, metota verilen isimden arka planda sql isteği oıluşturur.(description1: kolon ismi, find:select)
}
