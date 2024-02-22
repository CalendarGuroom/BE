package superstar.guroom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import superstar.guroom.dto.CalenderDTO;
import superstar.guroom.entity.Calender;
import superstar.guroom.repository.CalenderRepository;

import java.security.SecureRandom;

@Service
@RequiredArgsConstructor
public class CalenderService {

    private final CalenderRepository calenderRepository;
    public Calender addCalender(CalenderDTO calenderDTO){
        Calender calender = Calender.builder()
                .calenderTitle(calenderDTO.getCalenderTitle())
                .calenderCategory(calenderDTO.getCalenderCategory())
                .calenderCode(createCalenderCode())
                .build();
        calenderRepository.save(calender);
        return  calender;
    }

    // 캘린더별 고유 코드
    public String createCalenderCode(){
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom rm = new SecureRandom();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<8; i++) {
            //무작위로 문자열의 인덱스 반환
            int index = rm.nextInt(chars.length());
            //index의 위치한 랜덤값
            sb.append(chars.charAt(index));
        }

        return sb.toString();

    }
}
