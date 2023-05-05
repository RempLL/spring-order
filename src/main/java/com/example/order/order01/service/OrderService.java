package com.example.order.order01.service;

import com.example.order.order01.model.Cart;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {
    private final Cart cart;

    public OrderService(Cart cart) {
        this.cart = cart;
    }

    public void addCart(String id) {
        String[] arr = id.split(",");
        for (String s : arr) {
            try {
                cart.addCart(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                throw new NumberFormatException(s);
            }
        }
    }

    public List<Integer> getCart() {
        return cart.getCart();
    }
}
