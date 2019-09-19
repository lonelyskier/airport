package se.dl.airport.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterExampleController {

    @GetMapping
    public String greeting() {
        return "Hello World";
    }

    @GetMapping(value = "/greeting")
    public String customGreetings() {
        return "Hello From Custom Greetings";
    }

    @RequestMapping(value = "/333")
    public String hello() {
        return "Hello World22222";
    }

    @RequestMapping(value = "/arvid")
    public String arvid() {
        return "Älskar dig Kompi!";
    }

    @RequestMapping(value = "/hello")
    public String hello3() {
        return "HELLOOOOO";
    }
}