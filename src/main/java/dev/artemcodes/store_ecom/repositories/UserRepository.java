package dev.artemcodes.store_ecom.repositories;

import dev.artemcodes.store_ecom.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
