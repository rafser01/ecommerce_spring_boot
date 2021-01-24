/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bitsofts.teaching.ecommerce.controller;

import io.bitsofts.teaching.ecommerce.entity.Category;
import io.bitsofts.teaching.ecommerce.entity.Product;
import io.bitsofts.teaching.ecommerce.repository.CategoryRepository;
import io.bitsofts.teaching.ecommerce.repository.ProductRepository;
import java.util.ArrayList;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String getProducts(@RequestParam (name = "type", defaultValue = "gents") String type,Model m) {
        m.addAttribute("categories" , getCategories());
        
        String t="";
        ArrayList<Product> products=new ArrayList<>();
        // dynamic
        for(int i=0; i< getCategories().size(); i++) {
            Category c = getCategories().get(i);
            if(type.toLowerCase().equals(c.getCategoryName().toLowerCase())) {
                t = c.getCategoryName();
            }
        }
        m.addAttribute("caType", t);    
        return "products";
    }
    
}
