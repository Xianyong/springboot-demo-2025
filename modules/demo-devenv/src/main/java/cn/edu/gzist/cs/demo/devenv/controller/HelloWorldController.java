package cn.edu.gzist.cs.demo.devenv.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value = "/hello")
    public String SayHi(){
        return "Hi, the world.";
    }
}
