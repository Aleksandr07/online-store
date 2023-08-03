package pro.sky.java.course2.onlinestore.domain;


import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Repository
@SessionScope
public class Cart {
    private final List<Integer> cart;

    public Cart(List<Integer> cart) {
        this.cart = cart;
    }

    public List<Integer> getCart() {
        return cart;
    }

    public void addToCart(Integer productId) {
        cart.add(productId);
    }
}
