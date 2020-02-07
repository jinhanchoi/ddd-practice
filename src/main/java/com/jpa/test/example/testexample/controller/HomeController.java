package com.jpa.test.example.testexample.controller;

import com.jpa.test.example.testexample.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/home")
@RestController
public class HomeController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("/hello")
    public ResponseEntity<String> say_hello(){
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }
}
