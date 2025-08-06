package dev.artemcodes.store_ecom.repositories;

import dev.artemcodes.store_ecom.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
