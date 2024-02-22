package superstar.guroom;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import superstar.guroom.dto.CalenderDTO;
import superstar.guroom.entity.Calender;
import superstar.guroom.service.CalenderService;
import superstar.guroom.repository.CalenderRepository;

@SpringBootTest
class GuroomApplicationTests {

	CalenderService calenderService;

	CalenderRepository calenderRepository;

	@DisplayName("캘린더 추가 테스트")
	@Test
	public void addCalenderTest(){
		CalenderDTO calenderDTO = new CalenderDTO("희희","연인",Boolean.TRUE);
		Calender calender = calenderService.addCalender(calenderDTO);
		Assertions.assertThat(calender).isEqualTo(calenderRepository.findByCalenderCode(calender.getCalenderCode()));
	}

	@Test
	void contextLoads() {
	}

}
