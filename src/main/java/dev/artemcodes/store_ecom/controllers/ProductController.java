package dev.artemcodes.store_ecom.controllers;

import dev.artemcodes.store_ecom.dtos.ProductDto;
import dev.artemcodes.store_ecom.mappers.ProductMapper;
import dev.artemcodes.store_ecom.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @GetMapping
    public Iterable<ProductDto> getAllProducts(@RequestParam(required = false, name = "categoryId") Short categoryId) {
        var result = productRepository
                .findAll()
                .stream()
                .map(productMapper::toDto);

        if ( categoryId != null && categoryId >= 0 ) {
            result = result.filter(product -> categoryId.equals(product.getCategoryId()));
        }
        return result.toList();
    }
}
