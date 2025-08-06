package dev.artemcodes.store_ecom.controllers;

import dev.artemcodes.store_ecom.dtos.UserDto;
import dev.artemcodes.store_ecom.mappers.UserMapper;
import dev.artemcodes.store_ecom.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @GetMapping
    public Iterable<UserDto> getAllUsers(@RequestParam(required = false, defaultValue = "", name = "sort") String sort) {
        if (!Set.of("id", "name", "email").contains(sort)) {
            sort = "id";
        }

        return userRepository.findAll(Sort.by(sort)) //
                .stream()//
                .map(userMapper::toDto) //
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
        var user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userMapper.toDto(user));
    }
}
