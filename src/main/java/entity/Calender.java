package entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "calender")
public class Calender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calenderId;

    @Column
    private String calenderTitle;

    @Column
    private String calenderCategory;

    @Column
    private String calenderCode;


}
