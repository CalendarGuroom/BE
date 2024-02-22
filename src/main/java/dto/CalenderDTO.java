package dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalenderDTO {
    private Long calenderId;

    private String calenderTitle;

    private String calenderCategory;

    private String calenderCode;

}
