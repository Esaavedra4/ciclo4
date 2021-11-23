/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ciclo4.reto.Controllers;

import com.ciclo4.reto.Entities.user;
import com.ciclo4.reto.Services.userService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author blink
 */

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")


public class userController {


 @Autowired
    private userService userService;
    
    @GetMapping("/all")
    public List<user> getAll() {
        return userService.getAll();
    }
    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public user registrar(@RequestBody user user) {
        return userService.registrar(user);
    }
    
    @GetMapping("/{email}/{password}")
    public user autenticarUsuario(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.autenticarUsuario(email, password);
    }
    
    @GetMapping("/{email}")
    public boolean existeEmail(@PathVariable("email") String email) {
        return userService.existeEmail(email);
    }   
    
}

    
    

