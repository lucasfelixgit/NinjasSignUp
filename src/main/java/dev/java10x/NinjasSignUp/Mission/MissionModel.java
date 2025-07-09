package dev.java10x.NinjasSignUp.Mission;

import dev.java10x.NinjasSignUp.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String rank;

    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;
}
