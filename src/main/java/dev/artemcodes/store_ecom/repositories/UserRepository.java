package dev.artemcodes.store_ecom.repositories;

import dev.artemcodes.store_ecom.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
