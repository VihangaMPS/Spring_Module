package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

   /* @GetMapping
    public String getAllCustomer(){
        return "helli app is working";
    }*/


    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping
    public void saveCustomer( @ModelAttribute Customer customer){
        customerService.saveCustomer(customer);
    }

}
