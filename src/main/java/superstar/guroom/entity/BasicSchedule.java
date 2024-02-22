package superstar.guroom.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "basic_schedule")
public class BasicSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;

    @Column
    private String scheduleType;

    @Column
    private String scheduleTitle;

    @Column
    private Boolean scheduleAllTime;

    @Column
    private String scheduleStartDate;

    @Column
    private String scheduleStartTime;

    @Column
    private String scheduleEndDate;

    @Column
    private String scheduleEndTime;

    @Column
    private Boolean scheduleAlarm;

    @Column
    private String schedulePlace;

    @Column
    private String scheduleColor;

    @Column
    private Boolean scheduleComplete;





}
