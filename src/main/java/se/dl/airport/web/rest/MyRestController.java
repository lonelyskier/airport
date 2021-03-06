package se.dl.airport.web.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequestMapping("/rest")
@RestController
public class MyRestController {

    @GetMapping(value = "/hello")
    public String greeting() {
        log.info("Hello");
        return "Hello World";
    }
}