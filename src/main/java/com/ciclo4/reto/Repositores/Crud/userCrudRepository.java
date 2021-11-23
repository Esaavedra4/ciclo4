/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ciclo4.reto.Repositores.Crud;

import com.ciclo4.reto.Entities.user;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author blink
 */
public interface userCrudRepository extends CrudRepository <user, Integer>{
    
    Optional<user> findByEmail(String email);
    Optional<user> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);

}
