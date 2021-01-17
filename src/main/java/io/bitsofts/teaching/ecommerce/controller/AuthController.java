/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bitsofts.teaching.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author J2EE
 */
@Controller
public class AuthController {
    
    @RequestMapping(method = RequestMethod.GET, value = "/signup")
    public String signup() {
        return "signup";
    }
}
