package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharacterMapping {


//    @GetMapping("item/I??")
    public String test(){
        return "Get Mapping Invoked (test)";
    }

    @GetMapping("???/search")
    public String test2(){
        return "Get Mapping Invoked (test2)";
    }
}
