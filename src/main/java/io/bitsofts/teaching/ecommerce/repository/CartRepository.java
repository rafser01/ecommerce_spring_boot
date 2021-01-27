/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bitsofts.teaching.ecommerce.repository;

import io.bitsofts.teaching.ecommerce.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author J2EE
 */
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{
    
}
