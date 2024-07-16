package com.mypromotions.repository;

import com.mypromotions.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Add valid custom query methods if needed, e.g.,
    Optional<User> findByUsername(String username);

	User findByUsername(User user);
}
