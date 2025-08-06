package dev.artemcodes.store_ecom.repositories;

import dev.artemcodes.store_ecom.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
