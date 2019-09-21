package se.dl.airport.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rest")
@org.springframework.web.bind.annotation.RestController
public class MyRestController {

    @GetMapping(value = "/hello")
    public String greeting() {
        return "Hello World";
    }
}