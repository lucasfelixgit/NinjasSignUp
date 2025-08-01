package dev.java10x.NinjasSignUp.Ninja;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.NinjasSignUp.Mission.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//JPA = Java Persistence API
//@Entity turns a class into a database entity.
@Entity
@Table(name = "tb_ninjas")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "mission")
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
    @JsonIgnore
    private MissionModel mission;

    //added after the creation of DTO!
    private String rank;

    private String imgUrl;

}