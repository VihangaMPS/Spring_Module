package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("api/v1/customer")
@RestController
@CrossOrigin
public class CustomerController {

    @GetMapping
    public ArrayList<CustomerDTO> getAllCustomer(){
        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        arrayList.add(new CustomerDTO("C001","Dasun","GAlle",154084));
        arrayList.add(new CustomerDTO("C002","Nimal","Mathara",1000));
        arrayList.add(new CustomerDTO("C003","piyal","galle",84512));
        arrayList.add(new CustomerDTO("C004","sunil","colombo",52226));
        return arrayList;
    }

    @PostMapping(consumes = {"application/json/x-www-form-urlencoded"})
    public CustomerDTO saveCustomer(@ModelAttribute CustomerDTO dto){
        System.out.println(dto.toString());
        return dto;

    }


    @GetMapping(path = "/{id}/")
    public CustomerDTO searchCustomer(String id){
       return new  CustomerDTO(id,"dasun","Galle",4841);
    }


    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO updatedCustomer(@RequestBody CustomerDTO dto){
        System.out.println(dto.toString());
        return dto;

    }

    @DeleteMapping(params = {"id"})
    public CustomerDTO deleteCustomer(@RequestParam String id){
        return new  CustomerDTO(id,"dasun","Galle",4841);
    }

}
