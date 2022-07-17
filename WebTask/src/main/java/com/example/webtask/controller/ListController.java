package com.example.webtask.controller;

import com.example.webtask.entities.ListUsr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ListController {
    private ListUsr list = new ListUsr();
    @RequestMapping("/list")
    public String getList() {
        return "list";
    }
    @PostMapping("/list/add")
    @ResponseBody
    public String getAdd(@RequestParam String item) {
        return list.add(item);
    }
    @PostMapping("/list/add-listener")
    public String getListener() {
        list.addChangedListener();
        return "redirect:/list";
    }
    @PostMapping("/list/remove-listener")
    public String getDelete() {
        list.removeChangedListener();
        return "redirect:/list";
    }
}
