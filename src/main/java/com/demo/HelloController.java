package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping ("/{number}")
    public String printHello(Model modelMap,@RequestParam Integer number) {
        modelMap.addAttribute("inbox", number*=23000);
        return "hello";
    }
    @GetMapping()
    public String main(Model modelMap) {
        return "hello";
    }
}
