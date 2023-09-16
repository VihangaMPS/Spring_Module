package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public String getAllCustomer(){
        return "Hello There..?";
    }
    @PostMapping
    public String saveCustomer(){
        return "Customer Saved and Post Methods Invoked";
    }

    @DeleteMapping
    public String DeleteCustomer(){
        return "Customer Delete and Delete Method Invoked";
    }

    @PutMapping
    public String updatedCustomer(){
        return "Customer Updated and Customer Methods";
    }

}

