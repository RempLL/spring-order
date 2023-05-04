package com.example.order.order01.service;

import com.example.order.order01.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
        private final Cart cart;

    public OrderService(Cart cart) {
        this.cart = cart;
    }

    public void addCart(List<Integer> id){
        cart.addCart(id);
    }

    public List<Integer> getCart(){
        return cart.getCart();
    }
}
