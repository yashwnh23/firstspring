package first_package.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface users extends CrudRepository<User, String> {
    public String findByFirstName();
    Boolean existsByEmail(String email);
}
