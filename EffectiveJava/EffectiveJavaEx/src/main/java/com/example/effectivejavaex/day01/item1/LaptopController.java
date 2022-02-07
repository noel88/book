package com.example.effectivejavaex.day01.item1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class LaptopController {

    @PostMapping(value = "/add")
    public Laptop addLapTop(@RequestBody LaptopForm laptopForm) {
        return Laptop.from(laptopForm);
    }


}
