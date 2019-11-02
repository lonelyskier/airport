package se.dl.airport.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class MyRestController {

    @GetMapping(value = "/hello")
    public String greeting() {
        return "Hello World";
    }
}