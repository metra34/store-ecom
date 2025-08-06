package dev.artemcodes.store_ecom.repositories;

import dev.artemcodes.store_ecom.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
