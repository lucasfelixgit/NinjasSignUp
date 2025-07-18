package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    public List<NinjaModel> getNinjas() {
        return ninjaService.getNinjas();
    }

    //show ninjas by id (READ)
    @GetMapping("/get/{id}")
    public NinjaModel getNinjaByID(@PathVariable Long id) {
        return ninjaService.getNinjaByID(id);
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
