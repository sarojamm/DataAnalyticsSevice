package data.analytics.security.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import data.analytics.security.jwt.model.User;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
