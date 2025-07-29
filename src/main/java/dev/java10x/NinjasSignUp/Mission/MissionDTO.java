package dev.java10x.NinjasSignUp.Mission;

import dev.java10x.NinjasSignUp.Ninja.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissionDTO {

    private Long id;

    private String name;

    private String rank;

    private List<NinjaModel> ninjas;

}
