package dev.java10x.NinjasSignUp.Mission;

import dev.java10x.NinjasSignUp.Ninja.NinjaModel;

public class MissionMapper {

    public MissionModel map(MissionDTO missionDTO){

        MissionModel missionModel = new MissionModel();

        missionModel.setId(missionDTO.getId());
        missionModel.setName(missionDTO.getName());
        missionModel.setRank(missionDTO.getRank());
        missionModel.setNinjas(missionDTO.getNinjas());

        return missionModel;
    }

    public MissionDTO map(MissionModel missionModel) {

        MissionDTO missionDTO = new MissionDTO();

        missionDTO.setId(missionModel.getId());
        missionDTO.setName(missionModel.getName());
        missionDTO.setRank(missionModel.getRank());
        missionDTO.setNinjas(missionModel.getNinjas());

        return missionDTO;
    }



}
