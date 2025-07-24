package dev.java10x.NinjasSignUp.Ninja;

import dev.java10x.NinjasSignUp.Mission.MissionModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaDTO {

    private Long id;
    private String name;
    private String email;
    private int age;
    private MissionModel mission;

    //migration attributes
    private String rank;
    private String imgUrl;

}
