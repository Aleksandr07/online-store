package pro.sky.java.course2.onlinestore.services;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.onlinestore.domain.Cart;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String addToCart(List<Integer> productsId) {
        productsId.forEach(cart::addToCart);
        return "Товар(ы) добавлен(ы) в корзину";
    }

    @Override
    public List<Integer> getCart() {
        return cart.getCart();
    }
}
