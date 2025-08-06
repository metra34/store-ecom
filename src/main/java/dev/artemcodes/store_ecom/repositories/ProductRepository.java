package dev.artemcodes.store_ecom.repositories;

import dev.artemcodes.store_ecom.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Short categoryId);
}
