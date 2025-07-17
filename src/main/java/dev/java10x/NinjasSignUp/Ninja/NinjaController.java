package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
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
    @GetMapping("/get")
    public String getNinjas() {
        return "Showing all Ninjas!";
    }

    //show ninjas using id (CREATE)
    @GetMapping("/getID")
    public String getNinjaByID() {
        return "This is Ninja[ID]!";
    }

    //update ninjas (UPDATE)
    @PutMapping("/updateID")
    public String updateNinjaByID() {
        return "Ninja Updated!";
    }

    //delete ninjas (DELETE)
    @DeleteMapping("/deleteID")
    public String deleteNinjaByID() {
        return "Ninja Deleted!";
    }
    
}
