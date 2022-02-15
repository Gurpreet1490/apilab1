package com.apiinteractivelab.apilab1.controller;

import com.apiinteractivelab.apilab1.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CoffeeController {

    @GetMapping(value = "/coffeelover")
    public String coffeeLover(){

        return ("I like coffee!");
    }

    @GetMapping("/coffee")
    public Coffee coffee(@RequestParam(defaultValue = "latte", value = "name") String name){
        return new Coffee(1, name);
    }

}
