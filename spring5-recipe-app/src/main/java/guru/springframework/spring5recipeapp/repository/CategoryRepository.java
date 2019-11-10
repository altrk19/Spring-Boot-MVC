package guru.springframework.spring5recipeapp.repository;

import guru.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription1(String description);   //JPA arka planda Category sınıfının category1 değişkeni ile bu metotdaki description1'i eşler
}
