package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one")
public class WildCardMapping {


    // wild card mapping
    //Matches one or more Character in a path segment
    //test/*/hello -->  test//hello(not matching)
    //test/*/hello -->  test/1/hello( matching)
    //test/*/hello -->  test/abcd/hello( matching)
    //test/*/hello -->  test/abc/da/hello(not matching)

    @GetMapping(path = "test/*/hello")
    public String test(){
        return "Get Mapping Invoked (test) ";
    }

    @GetMapping(path = "hello/*/*")
    public String test2(){
        return "Get Mapping Invoked (test2) ";
    }



}
