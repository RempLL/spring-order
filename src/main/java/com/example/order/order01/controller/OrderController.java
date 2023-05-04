package com.example.order.order01.controller;

import com.example.order.order01.service.OrderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping("/add")
    public String addProduct(@RequestParam("id") List<Integer> id){
            orderService.addCart(id);
            return "Товар добавлен в корзину";
    }
    @GetMapping("/get")
    public List<Integer> getOrder(){
        return orderService.getCart();
    }

}