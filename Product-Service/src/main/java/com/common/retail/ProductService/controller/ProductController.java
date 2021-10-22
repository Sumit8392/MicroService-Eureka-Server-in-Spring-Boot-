package com.common.retail.ProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/Client")
    public String welcomeProduct(){
        return "Welcome Client";
    }
    @GetMapping
    public String welcome(){
        String url="http://SHOPPINGCART-SERVICE/Shopping";

        return restTemplate.getForObject(url,String.class);
    }

}
