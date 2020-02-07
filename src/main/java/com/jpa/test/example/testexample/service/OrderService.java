package com.jpa.test.example.testexample.service;

import com.jpa.test.example.testexample.order.domain.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Override
    public Order findById(Long id) {
        return null;
    }
}
