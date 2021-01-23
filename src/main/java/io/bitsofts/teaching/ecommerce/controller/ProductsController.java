/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bitsofts.teaching.ecommerce.controller;

import io.bitsofts.teaching.ecommerce.entity.Category;
import io.bitsofts.teaching.ecommerce.repository.CategoryRepository;
import io.bitsofts.teaching.ecommerce.repository.ProductRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author J2EE
 */
@Controller
public class ProductsController {
    
    @Autowired
    private CategoryRepository cr;
    
    @Autowired
    private ProductRepository  pr;
    
    public ArrayList<Category> getCategories() {
        return cr.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/products")
    public String getProducts(Model m) {
        m.addAttribute("categories" , getCategories());
        return "products";
    }
    
}
