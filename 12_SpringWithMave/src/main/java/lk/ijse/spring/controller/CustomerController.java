package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

//    @GetMapping
//    public String getAllCustomer(){
//        return "Hello Maven";
//    }

    // we can narrow down request using headers also

/*

    // consume
    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO searchCustomer(){
        return new CustomerDTO("C002","CMJD","Galle",45454.00);
    }

    // produces
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getAllCustomer(){
        return new CustomerDTO("C001","IJSE","Panadura",45454.00);
    }

*/

    //consume - if we put consumes type that means u have to put content type header
    //in the request

    //produce - if u want to state that what u'r are going to produce from here u can use produced header
    //also put to accept header in the request header
    @GetMapping(consumes = "application/json" ,produces = "application/json")
    public CustomerDTO testMethodOne(){
        return new CustomerDTO("C001","IJSE","Panadura",45454.00);
    }
}
