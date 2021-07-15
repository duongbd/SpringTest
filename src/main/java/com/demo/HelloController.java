package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

@Controller
@RequestMapping("")
public class HelloController {
    @GetMapping ("")
    public String printHello(ModelMap modelMap,@RequestParam(defaultValue = "") String word) {
        Map <String,String> map= new HashMap<>();
        map.put("cat","mèo" );
        map.put("dog","chó");
        map.put("horse","ngựa");
        if (word.equals("")) return "hello";
        if (map.containsKey(word)){
            modelMap.addAttribute("word",map.get(word));
        }
        else modelMap.addAttribute("word","Chúng tôi không tìm thấy từ này trong cơ sở dữ liệu");
        return "hello";
    }
}
