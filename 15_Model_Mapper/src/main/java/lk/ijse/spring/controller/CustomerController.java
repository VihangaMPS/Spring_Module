package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;

import lk.ijse.spring.service.impl.CustomerService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

   /* @GetMapping
    public String getAllCustomer(){
        return "helli app is working";
    }*/


    @GetMapping
    public ResponseUtil getAllCustomer(){
         return  new ResponseUtil(200,"Ok",customerService.getAllCustomer());
    }

    @PostMapping
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO customer){
        customerService.saveCustomer(customer);
        return new ResponseUtil(200,"ok",null);
    }

    @PutMapping
    public  ResponseUtil updateCustomer(@RequestBody CustomerDTO customer){
        customerService.updateCustomer(customer);
        return new ResponseUtil(200,"ok",null);

    }

    @DeleteMapping(params = {"id"})
    public ResponseUtil deleteCustomer(@RequestParam String id){
        customerService.deleteCustomer(id);
        return new ResponseUtil(200,"ok",null);

    }

    @GetMapping(path = "/{id} ")
    public ResponseUtil searchCustomer(@PathVariable String id ){
        return new ResponseUtil(200,"ok",customerService.searchCustomer(id));

    }

}
