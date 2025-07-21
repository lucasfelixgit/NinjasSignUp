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
    public NinjaModel createNinja(@RequestBody NinjaModel ninja){
        return ninjaService.createNinja(ninja);
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
    @PutMapping("/update/{id}")
    public NinjaModel updateNinjaByID(@PathVariable Long id, @RequestBody NinjaModel updatedNinja) {
        return ninjaService.updateNinja(id, updatedNinja);
    }

    //delete ninjas (DELETE)
    @DeleteMapping("/delete/{id}")
    public String deleteNinjaByID(@PathVariable Long id) {
        return ninjaService.deleteNinjaByID(id);
    }
    
}
