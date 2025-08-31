package com.projetotst.inicio.resources;

import com.projetotst.inicio.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "João Pedro", "Jão@gmail.com", "999999999", "218743hdfh");
        return ResponseEntity.ok().body(user);
    }
}
