package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(Model modelMap) {
        String s = "ABC";
        modelMap.addAttribute("inbox", s);
        return "hello";
    }
}
