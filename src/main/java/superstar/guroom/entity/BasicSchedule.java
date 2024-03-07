package superstar.guroom.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    // 수정 메서드
    public void updateScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public void updateScheduleTitle(String scheduleTitle) {
        this.scheduleTitle = scheduleTitle;
    }

    public void updateScheduleAllTime(Boolean scheduleAllTime) {
        this.scheduleAllTime = scheduleAllTime;
    }

    public void updateScheduleStartDate(String scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
    }

    public void updateScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public void updateScheduleEndDate(String scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
    }

    public void updateScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    public void updateScheduleAlarm(Boolean scheduleAlarm) {
        this.scheduleAlarm = scheduleAlarm;
    }

    public void updateSchedulePlace(String schedulePlace) {
        this.schedulePlace = schedulePlace;
    }

    public void updateScheduleColor(String scheduleColor) {
        this.scheduleColor = scheduleColor;
    }

    public void updateScheduleComplete(Boolean scheduleComplete) {
        this.scheduleComplete = scheduleComplete;
    }

}
