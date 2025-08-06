package dev.artemcodes.store_ecom.mappers;

import dev.artemcodes.store_ecom.dtos.UserDto;
import dev.artemcodes.store_ecom.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
