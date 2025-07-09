package dev.java10x.NinjasSignUp.Ninja;

import dev.java10x.NinjasSignUp.Mission.MissionModel;
import jakarta.persistence.*;

import java.util.List;

//JPA = Java Persistence API
//@Entity turns a class into a database entity.
@Entity
@Table(name = "tb_ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private int age;

    //@ManyToOne - A ninja has only one mission at a time, but a mission can have many ninjas.
    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionModel mission;


    public NinjaModel(){
    }

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}