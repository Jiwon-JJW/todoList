package todoList.repository;

import org.springframework.data.repository.CrudRepository;
import todoList.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
