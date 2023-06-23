package com.hm.authservice.controller;

import com.hm.authservice.service.AuthorizationService;
import com.hm.authservice.model.Authorities;
import com.hm.authservice.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {

    private AuthorizationService service;

    @Autowired
    public AuthorizationController(AuthorizationService service){
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user){
        return service.getAuthorities(user);
    }
}
