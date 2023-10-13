package pl.taw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.taw.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
