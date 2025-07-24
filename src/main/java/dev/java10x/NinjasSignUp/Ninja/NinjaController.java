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
    public NinjaDTO createNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.createNinja(ninja);
    }

    //show all ninjas (READ)
    @GetMapping("/get")
    public List<NinjaDTO> getNinjas() {
        return ninjaService.getNinjas();
    }

    //show ninjas by id (READ)
    @GetMapping("/get/{id}")
    public NinjaDTO getNinjaByID(@PathVariable Long id) {
        return ninjaService.getNinjaByID(id);
    }

    //update ninjas (UPDATE)
    @PutMapping("/update/{id}")
    public NinjaDTO updateNinjaByID(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        return ninjaService.updateNinja(id, ninja);
    }

    //delete ninjas (DELETE)
    @DeleteMapping("/delete/{id}")
    public String deleteNinjaByID(@PathVariable Long id) {
        return ninjaService.deleteNinjaByID(id);
    }
    
}
