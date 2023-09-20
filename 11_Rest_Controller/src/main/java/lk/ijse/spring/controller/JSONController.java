package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping
    public String getJsonRequest(){
        return "Hello JSON";
    }
}
