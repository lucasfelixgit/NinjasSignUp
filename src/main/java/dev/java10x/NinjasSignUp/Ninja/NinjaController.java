package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/greetings")
    public String greetings() {
        return "Hello, Ninja!";
    }

    //create ninjas (CREATE)
    @PostMapping("/create")
    public String createNinja(){
        return "Ninja Created!";
    }

    //show all ninjas (READ)
    @GetMapping("/all")
    public String showAllNinjas() {
        return "Showing all Ninjas!";
    }

    //show ninjas using id (CREATE)
    @GetMapping("/allID")
    public String showAllNinjasID() {
        return "This is Ninja[ID]!";
    }

    //update ninjas (UPDATE)
    @PutMapping("/updateID")
    public String updateNinjaID() {
        return "Ninja Updated!";
    }

    //delete ninjas (DELETE)
    @DeleteMapping("/deleteID")
    public String deleteNinjaID() {
        return "Ninja Deleted!";
    }
    
}
