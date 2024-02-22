package superstar.guroom.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class CalenderDTO {
    private String calenderTitle;

    private String calenderCategory;

    private Boolean linkMyCalender;

}
