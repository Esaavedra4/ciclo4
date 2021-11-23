/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ciclo4.reto.Repositories;

import com.ciclo4.reto.Entities.user;
import com.ciclo4.reto.Repositores.Crud.userCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author blink
 */
@Repository
public class userRepository {
    @Autowired
    private userCrudRepository userCrudRepository;

    public List<user> getAll() {
        return (List<user>) userCrudRepository.findAll();
    }

    public Optional<user> getUser(int id) {
        return userCrudRepository.findById(id);
    }

    public user save(user user) {
        return userCrudRepository.save(user);
    }

    public boolean existeEmail(String email) {
        Optional<user> usuario = userCrudRepository.findByEmail(email);

        return !usuario.isEmpty();
    }

    public Optional<user> autenticarUsuario(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
    
}
