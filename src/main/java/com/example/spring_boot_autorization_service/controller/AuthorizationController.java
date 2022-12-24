package com.example.spring_boot_autorization_service.controller;

import com.example.spring_boot_autorization_service.service.Authorities;
import com.example.spring_boot_autorization_service.service.AuthorizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AuthorizationController {
    AuthorizationService service;
    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}
