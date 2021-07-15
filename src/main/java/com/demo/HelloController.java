package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class HelloController {
    @GetMapping ("")
    public String printHello(Model modelMap,@RequestParam(defaultValue = "0") Float number) {
        modelMap.addAttribute("inbox", number*=23000);
        return "hello";
    }
}
