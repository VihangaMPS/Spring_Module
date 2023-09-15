package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("two")
public class ControllerTwo {

    @GetMapping
    public  String testTwo() {
        return "Customer ";
    }
}
