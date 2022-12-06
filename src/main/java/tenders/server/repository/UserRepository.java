package tenders.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tenders.server.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
  Optional<User> findByLoginAndPassword(String login, String password);
  Optional<User> findByLogin(String login);
}
