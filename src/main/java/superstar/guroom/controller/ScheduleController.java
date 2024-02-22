package superstar.guroom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import superstar.guroom.dto.ScheduleDTO;
import superstar.guroom.repository.ScheduleRepository;
import superstar.guroom.service.ScheduleService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/schedule")
public class ScheduleController {
    private final ScheduleService scheduleService;

    // 일정 추가하기
    @PostMapping("/create/{calenderId}")
    public ResponseEntity<?> createSchedule(@PathVariable("calenderId") Long calenderId, @RequestBody ScheduleDTO scheduleDTO) {
        return ResponseEntity.ok(scheduleService.createSchedule(calenderId, scheduleDTO));
    }

    // 일정 상세 정보 조회하기
    @GetMapping("/detail/{scheduleId}")
    public ResponseEntity<?> detailSchedule(@PathVariable("scheduleId") Long scheduleId) {
        return ResponseEntity.ok(scheduleService.detailSchedule(scheduleId));
    }

}
