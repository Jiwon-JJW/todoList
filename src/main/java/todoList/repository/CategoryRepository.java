package todoList.repository;

import org.springframework.data.repository.CrudRepository;
import todoList.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
