package todoList.repository;

import org.springframework.data.repository.CrudRepository;
import todoList.domain.Card;

public interface CardRepository extends CrudRepository<Card, Long> {
}
