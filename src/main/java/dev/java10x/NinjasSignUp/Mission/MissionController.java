package dev.java10x.NinjasSignUp.Mission;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mission")
public class MissionController {

    @PostMapping("/create")
    public String createMission() {
        return "Mission Created!";
    }

    @GetMapping("/get")
    public String getMission(){
        return "Missions Listed!";
    }

    @PutMapping("/update")
    public String updateMission() {
        return "Mission Updated!";
    }

    @DeleteMapping("/delete")
    public String deleteMission() {
        return "Mission Deleted!";
    }

}
