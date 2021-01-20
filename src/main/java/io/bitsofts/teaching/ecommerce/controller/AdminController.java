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
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author J2EE
 */
@Controller
public class AdminController {
    
    @Autowired
    private CategoryRepository cr;
    @Autowired
    private ProductRepository pr;
    @RequestMapping(method = RequestMethod.GET, value = "/admin/categories")
    public String getCategories(Model m) {
        ArrayList<Category> cs = cr.findAll();
        m.addAttribute("categories", cs);
        return "admin_categories";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/admin/products")
    public String getProducts(Model m) {
//        ArrayList<Product> ps = pr.findAll();
//        m.addAttribute("products", ps);
        return "admin_products";
    }
    
    //consumes = "application/x-www-form-urlencoded"
    @PostMapping(path = "/addCategory")
    public String addCategory(@RequestParam Map<String, String> params, Model m) {
        Category c = new Category();
        c.setCategoryName(params.get("categoryName"));
        c.setDescription(params.get("description"));
        c.setImg(params.get("img"));
        cr.save(c);
        // model list 
        ArrayList<Category> cs = cr.findAll();
        m.addAttribute("categories", cs);
        return "admin_categories";
    }
    
}
