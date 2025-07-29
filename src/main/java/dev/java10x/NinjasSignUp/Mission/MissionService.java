package dev.java10x.NinjasSignUp.Mission;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissionService {

    private final MissionRepository missionRepository;
    private final MissionMapper missionMapper;

    public MissionService(MissionRepository missionRepository, MissionMapper missionMapper) {
        this.missionRepository = missionRepository;
        this.missionMapper = missionMapper;
    }

    public List<MissionDTO> getMissions() {
        List<MissionModel> missions = missionRepository.findAll();

        return missions.stream()
                .map(missionMapper::map)
                .collect(Collectors.toList());
    }

    public MissionDTO getMissionByID(Long id) {
        Optional<MissionModel> mission = missionRepository.findById(id);
        return mission.map(missionMapper::map).orElse(null);
    }

    public MissionDTO createMission(MissionDTO missionDTO) {
        MissionModel mission = missionMapper.map(missionDTO);
        missionRepository.save(mission);
        return missionMapper.map(mission);
    }

    public MissionDTO updateMission(Long id, MissionDTO missionDTO){
        Optional<MissionModel> existentMission = missionRepository.findById(id);

        if (existentMission.isPresent()){
            MissionModel updatedMission = missionMapper.map(missionDTO);
            updatedMission.setId(id);
            missionRepository.save(updatedMission);
            return missionMapper.map(updatedMission);
        }

        return null;
    }


    public void deleteMission(Long id) {
        missionRepository.deleteById(id);
    }


}
