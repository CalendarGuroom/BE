package superstar.guroom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import superstar.guroom.dto.ScheduleDTO;
import superstar.guroom.repository.ScheduleRepository;
import superstar.guroom.service.ScheduleService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/create/{calenderId}")
    public ResponseEntity<?> createSchedule(@PathVariable("calenderId") Long calenderId, @RequestBody ScheduleDTO scheduleDTO) {
        return ResponseEntity.ok(scheduleService.createSchedule(calenderId, scheduleDTO));
    }
}
