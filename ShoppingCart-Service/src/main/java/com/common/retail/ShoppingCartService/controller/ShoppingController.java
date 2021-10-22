package com.common.retail.ShoppingCartService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Shopping")
public class ShoppingController {

    @GetMapping
    public String welcome() {
        return "Welcome to Shopping page";
    }
}