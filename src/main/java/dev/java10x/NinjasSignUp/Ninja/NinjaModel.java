package dev.java10x.NinjasSignUp.Ninja;

import dev.java10x.NinjasSignUp.Mission.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA = Java Persistence API
//@Entity turns a class into a database entity.
@Entity
@Table(name = "tb_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    //@ManyToOne - A ninja has only one mission at a time, but a mission can have many ninjas.
    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionModel mission;

    //added after the creation of DTO!
    private String rank;

    private String imgUrl;

}