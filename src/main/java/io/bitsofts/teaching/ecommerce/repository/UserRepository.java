/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bitsofts.teaching.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import io.bitsofts.teaching.ecommerce.entity.User;
import org.springframework.stereotype.Repository;
/**
 *
 * @author J2EE
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
   User findByEmailAndPassword(String email, String password);
}
