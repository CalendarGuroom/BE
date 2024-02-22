package superstar.guroom.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScheduleDTO {
    private Long scheduleId;

    private String scheduleType;

    private String scheduleTitle;

    private Boolean scheduleAllTime;

    private String scheduleStartDate;

    private String scheduleStartTime;

    private String scheduleEndDate;

    private String scheduleEndTime;

    private Boolean scheduleAlarm;

    private String schedulePlace;

    private String scheduleColor;

    private Boolean scheduleComplete;
}
