package com.Assignment.restAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
    @GetMapping("/home")
    public String home(){
        return "This is Home Page";
    }
}
