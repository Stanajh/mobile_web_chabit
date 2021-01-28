package backend.repository;

import backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository{
    User save(User user);
    Optional<User> findByUserId(Long userId);
    Optional<User> findByUserEmailAndUserUserPassword(String userEamil, String userPassword);
    List<User> findAll();
    void clearStore();
}