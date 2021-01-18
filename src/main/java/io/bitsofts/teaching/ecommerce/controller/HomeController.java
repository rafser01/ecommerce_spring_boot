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
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author J2EE
 */
@Controller
public class HomeController {
    private SessionFactory hibernateFactory;
//
//    @Autowired
//    private CategoryRepository cr;
//
//    @Autowired
//    private ProductRepository pr;

    @Autowired
    public HomeController(EntityManagerFactory factory) {
        if (factory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.hibernateFactory = factory.unwrap(SessionFactory.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String home() {
//        ArrayList<Category> list = cr.findAll();
////        List<Product> prlist = pr.findAll();
////        System.out.println("--------- " + prlist.size());
//        for (int i = 0; i < list.size(); i++) {
//            Category c = list.get(i);
//            System.out.println("e" + c.getCategoryName());
//            Iterator<Product> it = c.getProducts().iterator();
//            while(it.hasNext()) {
//                System.out.println("P -- "+it.next().getDescription());
//            }
//
//        }

        return "home_page";
    }
}
