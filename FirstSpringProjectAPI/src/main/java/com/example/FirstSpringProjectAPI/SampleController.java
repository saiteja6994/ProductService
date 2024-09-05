package com.example.FirstSpringProjectAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//this controller contains https API's
@RestController
//localhost:8080
@RequestMapping("/Sample")
//localhost:8080/Sample
//All the API's with /sample will come to this point
public class SampleController {
    //localhost:8080/sample/sayHello
    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return  "Say "+name;
    }
}
