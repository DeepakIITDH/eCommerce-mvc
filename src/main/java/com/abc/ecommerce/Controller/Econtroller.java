package com.abc.ecommerce.Controller;

import com.abc.ecommerce.Model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Econtroller {

    @GetMapping("/addForm")
    public String addForm(Model m){
        Cart cart = new Cart();
        m.addAttribute("r",cart);
        return "form";
    }

    @PostMapping("/data")
    public String showCart(Cart cart,Model m){
//        System.out.println(cart.getName() + cart.getCost());
        m.addAttribute("data",cart);
        return "showCart";
    }
}
