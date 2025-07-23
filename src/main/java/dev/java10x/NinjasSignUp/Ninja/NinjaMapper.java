package dev.java10x.NinjasSignUp.Ninja;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO){

        NinjaModel ninjaModel = new NinjaModel();

        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setName(ninjaDTO.getName());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setAge(ninjaDTO.getAge());
        ninjaModel.setMission(ninjaDTO.getMission());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setImgUrl(ninjaDTO.getImgUrl());

        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {

        NinjaDTO ninjaDTO = new NinjaDTO();

        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setName(ninjaModel.getName());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setAge(ninjaModel.getAge());
        ninjaDTO.setMission(ninjaModel.getMission());
        ninjaDTO.setRank(ninjaModel.getRank());
        ninjaDTO.setImgUrl(ninjaModel.getImgUrl());

        return ninjaDTO;
    }

}
