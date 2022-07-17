package com.example.webtask.controller;

import com.example.webtask.entities.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CounterController {
    @RequestMapping("/counter")
    public String getCounter() {

        return "counter";
    }
    @PostMapping("/counter/add")
    public String getAdd() {
        new Counter();
        return "redirect:/counter";
    }

}
