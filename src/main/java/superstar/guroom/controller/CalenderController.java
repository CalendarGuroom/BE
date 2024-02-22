package superstar.guroom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import superstar.guroom.dto.CalenderDTO;
import superstar.guroom.service.CalenderService;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/calender")
public class CalenderController {

    private final CalenderService calenderService;
    @PostMapping("/add/{userId}")
    public ResponseEntity<String> addCalender(@PathVariable("userId") String userId, @RequestBody CalenderDTO calenderDTO){
        calenderService.addCalender(calenderDTO);
        return ResponseEntity.ok().body(calenderDTO.getCalenderTitle() + " 추가 성공");
    }
}
