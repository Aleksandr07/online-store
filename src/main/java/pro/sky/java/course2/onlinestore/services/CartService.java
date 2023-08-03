package pro.sky.java.course2.onlinestore.services;

import java.util.List;

public interface CartService {
    String addToCart(List<Integer> productsId);

    List<Integer> getCart();
}
