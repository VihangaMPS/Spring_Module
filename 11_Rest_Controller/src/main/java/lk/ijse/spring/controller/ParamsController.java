package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {

    @GetMapping(params = {"param1","param2"})
    public String test1(){
        return "Hello 1";
    }


    @GetMapping
    public String test2(){
        return "Hello 2";
    }
}
