/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bitsofts.teaching.ecommerce.controller;

import io.bitsofts.teaching.ecommerce.entity.Cart;
import io.bitsofts.teaching.ecommerce.entity.CartItem;
import io.bitsofts.teaching.ecommerce.entity.Category;
import io.bitsofts.teaching.ecommerce.entity.Product;
import io.bitsofts.teaching.ecommerce.entity.User;
import io.bitsofts.teaching.ecommerce.repository.CartItemRepository;
import io.bitsofts.teaching.ecommerce.repository.CartRepository;
import io.bitsofts.teaching.ecommerce.repository.CategoryRepository;
import io.bitsofts.teaching.ecommerce.repository.ProductRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

/**
 *
 * @author J2EE
 */
@SessionScope
@Controller
public class ProductsController {

    @Autowired
    private CategoryRepository cr;

    @Autowired
    private ProductRepository pr;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    public ArrayList<Category> getCategories() {
        return cr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    public String getProducts(@RequestParam(name = "type", defaultValue = "gents") String type, Model m) {
        m.addAttribute("categories", getCategories());
        
        String t = "";
        ArrayList<Product> products = new ArrayList<>();
        // dynamic
        for (int i = 0; i < getCategories().size(); i++) {
            Category c = getCategories().get(i);
            if (type.toLowerCase().equals(c.getCategoryName().toLowerCase())) {
                t = c.getCategoryName();
            }
        }
        m.addAttribute("caType", t);
        return "products";
    }

    @GetMapping(path = "/addToCart")
    public String addToCart(@RequestParam Map<String, String> params, Model m, HttpSession session) {
//        
//          Cart c = 
//        m.addAttribute(string, p)
        User user = (User) session.getAttribute("userId");
        if (user != null) {
            System.out.println("User ID " + user.getId());
            Cart c = (Cart) session.getAttribute("cart");
            if (c != null) {

            } else {
                c = new Cart();

            }
            Set<CartItem> items = c.getCartItems();
            CartItem item = new CartItem();
            Product p = pr.findById(Integer.parseInt(params.get("id")));
            item.setProduct(p);
            item.setQuantity(1);
            item.setCart(c);
            items.add(item);
            c.setCartItems(items);
            session.setAttribute("cart", c);
            session.setAttribute("cartSize", c.getCartItems().size());
        } else {
            return "redirect:loginView";
        }
        return "redirect:products";
    }

}
