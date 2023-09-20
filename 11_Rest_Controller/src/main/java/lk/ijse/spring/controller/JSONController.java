package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping
    public String getJsonRequest(@ModelAttribute CustomerDTO dto){
        return "Hello JSON"+ dto.toString();
    }

    @GetMapping(produces = {"application/json"})
    public CustomerDTO sendBackJSON( ){
        return new  CustomerDTO("C001","Amal","Galle",1000.00);
    }
}
