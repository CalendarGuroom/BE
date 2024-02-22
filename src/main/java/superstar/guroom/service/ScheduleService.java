package superstar.guroom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import superstar.guroom.dto.ScheduleDTO;
import superstar.guroom.entity.BasicSchedule;
import superstar.guroom.repository.ScheduleRepository;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public BasicSchedule createSchedule(Long calenderId, ScheduleDTO scheduleDTO) {
        BasicSchedule basicSchedule = BasicSchedule.builder()
                .scheduleType(scheduleDTO.getScheduleType())
                .scheduleTitle(scheduleDTO.getScheduleTitle())
                .scheduleAllTime(scheduleDTO.getScheduleAllTime())
                .scheduleStartDate(scheduleDTO.getScheduleStartDate())
                .scheduleStartTime(scheduleDTO.getScheduleStartTime())
                .scheduleEndDate(scheduleDTO.getScheduleEndDate())
                .scheduleEndTime(scheduleDTO.getScheduleEndTime())
                .scheduleAlarm(scheduleDTO.getScheduleAlarm())
                .schedulePlace(scheduleDTO.getSchedulePlace())
                .scheduleColor(scheduleDTO.getScheduleColor())
                .scheduleComplete(scheduleDTO.getScheduleComplete())
                .build();
        scheduleRepository.save(basicSchedule);
        return basicSchedule;
    }
}
