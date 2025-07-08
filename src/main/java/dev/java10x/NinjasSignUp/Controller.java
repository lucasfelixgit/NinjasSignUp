package dev.java10x.NinjasSignUp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/greetings")
    public String greetings() {
        return "Hello, Ninja!";
    }

}
