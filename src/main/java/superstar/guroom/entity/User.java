package superstar.guroom.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.awt.*;

@Entity
@Getter
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private Long userId;

    @Column
    private String userName;

    private String userRegion;

    private String userSchool;

    private String userImg;

}
