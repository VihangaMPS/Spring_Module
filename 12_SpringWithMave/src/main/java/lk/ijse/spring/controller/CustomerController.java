package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
