package com.example.order.order01.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private List<Integer> cart = new ArrayList<>();

    public void addCart(List<Integer> id){
        cart.addAll(id);
    }

    public List<Integer> getCart(){
        return cart;
    }

}
