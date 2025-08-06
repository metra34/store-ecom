package dev.artemcodes.store_ecom.mappers;

import dev.artemcodes.store_ecom.dtos.ProductDto;
import dev.artemcodes.store_ecom.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);
}
