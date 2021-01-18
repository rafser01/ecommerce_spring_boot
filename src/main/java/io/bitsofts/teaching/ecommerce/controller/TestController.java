/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bitsofts.teaching.ecommerce.controller;

import io.bitsofts.teaching.ecommerce.entity.Category;
import io.bitsofts.teaching.ecommerce.entity.Product;
import io.bitsofts.teaching.ecommerce.repository.CategoryRepository;
import java.util.Iterator;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author J2EE
 */
@Controller
public class TestController {
//    @Autowired
//    private CategoryRepository repository;
    
    @PostConstruct
    public void init() {
//        Category c = repository.findById(1);
//        System.out.println("--------------- "+c.getCategoryName());
    }
    
//    @RequestMapping(method = RequestMethod.GET, value = "/home")
//    public String home() {
////        Category c = repository.findById(1);
////        Iterator<Product> cs = c.getProducts().iterator();
////        System.out.println("---------- "+c.getProducts().size()+c.getDescription());
////        while (cs.hasNext()) {            
////            System.out.println("-------- "+cs.next().getProductName());
////        }
////        System.out.println("--------------- "+c.getId()+c.getDescription()+c.getProducts().iterator().next().getId());
//        return "home_page";
//    }
    
}
