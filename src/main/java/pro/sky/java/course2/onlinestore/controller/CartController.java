package pro.sky.java.course2.onlinestore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.onlinestore.services.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping("/add")
    public String addToCart(@RequestParam List<Integer> ids) {
        return cartService.addToCart(ids);
    }

    @GetMapping("/get")
    public List<Integer> getCart() {
        return cartService.getCart();
    }
}
