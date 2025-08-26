package dev.artemcodes.store_ecom.repositories;

import dev.artemcodes.store_ecom.entities.Product;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @EntityGraph(attributePaths = {"category"})
    List<Product> findByCategoryId(Short categoryId);

    @EntityGraph(attributePaths = {"category"})
    @Query("select p from Product p")
    List<Product> findAllWithCategory();
}
