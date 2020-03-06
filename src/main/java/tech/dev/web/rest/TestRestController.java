package tech.dev.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping("/testrest")
    public String home(){
        return "Hello World!";
    }
}
