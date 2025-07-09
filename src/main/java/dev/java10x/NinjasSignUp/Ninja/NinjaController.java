package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/greetings")
    public String greetings() {
        return "Hello, Ninja!";
    }

}
