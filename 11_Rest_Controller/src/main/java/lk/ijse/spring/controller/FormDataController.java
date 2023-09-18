package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormDataController {

    @PostMapping
    public String testForm1(@ModelAttribute CustomerDTO dto){
        return "Hello Request Received "+dto.toString();
    }


}
