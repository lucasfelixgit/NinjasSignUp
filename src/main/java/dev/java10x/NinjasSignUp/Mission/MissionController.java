package dev.java10x.NinjasSignUp.Mission;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missions")
public class MissionController {

    private final MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createMission(@RequestBody MissionDTO mission) {
        MissionDTO createdMission = missionService.createMission(mission);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Mission with ID: " + createdMission.getId() + " " + createdMission.getName() + " created!");
    }

    @GetMapping("/get")
    public ResponseEntity<List<MissionDTO>> getMission(){
        List<MissionDTO> missions = missionService.getMissions();
        return ResponseEntity.ok(missions);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getMission(@PathVariable Long id){
        MissionDTO mission = missionService.getMissionByID(id);

        if (mission != null) {
            return ResponseEntity.ok(mission);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Mission with ID: " + id + " not found.");
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateMission(@PathVariable Long id, @RequestBody MissionDTO missionDTO) {
        MissionDTO mission = missionService.updateMission(id, missionDTO);

        if (mission != null) {
            return ResponseEntity.ok("Mission updated!: " + mission);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Mission with ID: " + id + " not found.");
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteMission(@PathVariable Long id) {
        MissionDTO mission = missionService.getMissionByID(id);

        if(mission != null){
            missionService.deleteMission(id);
            return ResponseEntity.ok("Mission with ID: " + id + " deleted successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Mission with ID: " + id + " not found.");
        }
    }

}
