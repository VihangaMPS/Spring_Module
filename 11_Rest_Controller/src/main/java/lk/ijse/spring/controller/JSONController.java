package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping //if u want to get json request content u have to use @RequestBody
    public String getJsonRequest(@RequestBody CustomerDTO dto){
        return "Hello JSON"+ dto.toString();
    }

    // to return json response u need json converter in the classpath
    @GetMapping(path = "array",produces = {MediaType.APPLICATION_JSON_VALUE}) //content-type = application/json
    public ArrayList<CustomerDTO> sendBackJSON( ){
        ArrayList<CustomerDTO> all = new ArrayList<>();
        all.add(new  CustomerDTO("C001","Amal","Galle",1000.00));
        all.add(new  CustomerDTO("C002","kamal","mathara",5440.00));
        all.add(new  CustomerDTO("C003","piyal","colombo",979190.00));
        return all;
    }
}
