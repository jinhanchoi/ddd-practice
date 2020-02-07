package com.jpa.test.example.testexample.service;

import com.jpa.test.example.testexample.order.domain.Order;

public interface IOrderService {
    Order findById(Long id);
}
