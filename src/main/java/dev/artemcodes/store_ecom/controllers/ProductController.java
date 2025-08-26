package dev.artemcodes.store_ecom.controllers;

import dev.artemcodes.store_ecom.dtos.ProductDto;
import dev.artemcodes.store_ecom.mappers.ProductMapper;
import dev.artemcodes.store_ecom.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @GetMapping
    public Iterable<ProductDto> getAllProducts(@RequestParam(required = false, name = "categoryId") Short categoryId) {
        var result = categoryId != null && categoryId > 0 ?
                productRepository.findByCategoryId(categoryId) :
                productRepository.findAllWithCategory();
        return result.stream().map(productMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable Long id) {
        var product = productRepository.findById(id).orElse(null);
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productMapper.toDto(product));
    }
}
