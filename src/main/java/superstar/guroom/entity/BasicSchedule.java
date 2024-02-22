package superstar.guroom.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
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

    // 생성자 추가
    public BasicSchedule(Long scheduleId, String scheduleType, String scheduleTitle, Boolean scheduleAllTime, String scheduleStartDate, String scheduleStartTime, String scheduleEndDate, String scheduleEndTime, Boolean scheduleAlarm, String schedulePlace, String scheduleColor, Boolean scheduleComplete) {
        this.scheduleId = scheduleId;
        this.scheduleType = scheduleType;
        this.scheduleTitle = scheduleTitle;
        this.scheduleAllTime = scheduleAllTime;
        this.scheduleStartDate = scheduleStartDate;
        this.scheduleStartTime = scheduleStartTime;
        this.scheduleEndDate = scheduleEndDate;
        this.scheduleEndTime = scheduleEndTime;
        this.scheduleAlarm = scheduleAlarm;
        this.schedulePlace = schedulePlace;
        this.scheduleColor = scheduleColor;
        this.scheduleComplete = scheduleComplete;
    }
}
