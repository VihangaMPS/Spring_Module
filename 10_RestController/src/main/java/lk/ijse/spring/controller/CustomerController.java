package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    private String customer;

    public String getAllCustomer(){
        return "Hello There..?";
    }
}
