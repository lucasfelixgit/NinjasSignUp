package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.IllegalFormatCodePointException;
import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/greetings")
    public String greetings() {
        return "Hello, Ninja!";
    }

    //create ninjas (CREATE)
    @PostMapping("/create")
    public ResponseEntity<String> createNinja(@RequestBody NinjaDTO ninja){
        NinjaDTO newNinja = ninjaService.createNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja created successfully! : " + newNinja.getName() + " (ID): " + newNinja.getId());
    }

    //show all ninjas (READ)
    @GetMapping("/get")
    public ResponseEntity<List<NinjaDTO>> getNinjas() {
        List<NinjaDTO> ninjas = ninjaService.getNinjas();
        return ResponseEntity.ok(ninjas);
    }

    //show ninjas by id (READ)
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getNinjaByID(@PathVariable Long id) {
        NinjaDTO ninja = ninjaService.getNinjaByID(id);

        if (ninja != null) {
            return ResponseEntity.ok(ninja);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja with ID: " + id + " not found.");
        }
    }

    //update ninjas (UPDATE)
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateNinjaByID(@PathVariable Long id, @RequestBody NinjaDTO ninja) {

        NinjaDTO updatedNinja = ninjaService.updateNinja(id, ninja);

        if (updatedNinja != null){
            return ResponseEntity.ok(ninja);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja with ID: " + id + " not found.");
        }
    }

    //delete ninjas (DELETE)
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteNinjaByID(@PathVariable Long id) {
        if (ninjaService.getNinjaByID(id) != null){
            ninjaService.deleteNinjaByID(id);
            return ResponseEntity.ok("Ninja with ID: " + id + " deleted successfully!");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja with ID: " + id + " not found.");
        }
    }
    
}
