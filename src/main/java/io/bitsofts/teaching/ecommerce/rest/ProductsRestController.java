/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bitsofts.teaching.ecommerce.rest;

import io.bitsofts.teaching.ecommerce.entity.Product;
import io.bitsofts.teaching.ecommerce.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author J2EE
 */
@RestController()
public class ProductsRestController {
    @Autowired
    private ProductRepository pr;
    
//    @GetMapping("/api/products")
    @RequestMapping(method = RequestMethod.GET, value = "/api/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(pr.findAll(), HttpStatus.OK);
    }
    
    @GetMapping(path = "/api/product")
    public ResponseEntity<Product> getproductById(@RequestParam(name = "id") int id){
        return new ResponseEntity<>(pr.findById(id), HttpStatus.OK);
    }
    
    
}
