package dev.java10x.NinjasSignUp.Mission;

public class MissionService {

    private MissionRepository missionRepository;
    private MissionMapper missionMapper;

    public MissionService(MissionRepository missionRepository, MissionMapper missionMapper) {
        this.missionRepository = missionRepository;
        this.missionMapper = missionMapper;
    }


}
