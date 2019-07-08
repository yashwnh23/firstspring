package first_package.db.repository.model;

import first_package.db.repository.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

@Repository
public interface users extends CrudRepository<User, String> {
  List<User> findAll();
  User findById(int id);

  @Override
  Optional<User> findById(String s);

  List<User> findTopByNameContainingOrderByIdAsc(String name);
}
