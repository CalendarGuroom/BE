package superstar.guroom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import superstar.guroom.dto.ScheduleDTO;
import superstar.guroom.entity.BasicSchedule;
import superstar.guroom.repository.ScheduleRepository;

import java.util.Optional;

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

    public BasicSchedule detailSchedule(Long scheduleId) {
        Optional<BasicSchedule> optionalBasicSchedule = scheduleRepository.findById(scheduleId);

        // 해당 scheduleId로 일정을 찾을 수 없는 경우
        if (optionalBasicSchedule.isEmpty()) {
            // 예외 처리 로직
            throw new RuntimeException("일정을 찾을 수 없습니다. scheduleId : " + scheduleId);
        }

        BasicSchedule basicSchedule = optionalBasicSchedule.get();
        return BasicSchedule.builder()
                .scheduleId(basicSchedule.getScheduleId())
                .scheduleType(basicSchedule.getScheduleType())
                .scheduleTitle(basicSchedule.getScheduleTitle())
                .scheduleAllTime(basicSchedule.getScheduleAllTime())
                .scheduleStartDate(basicSchedule.getScheduleStartDate())
                .scheduleStartTime(basicSchedule.getScheduleStartTime())
                .scheduleEndDate(basicSchedule.getScheduleEndDate())
                .scheduleEndTime(basicSchedule.getScheduleEndTime())
                .scheduleAlarm(basicSchedule.getScheduleAlarm())
                .schedulePlace(basicSchedule.getSchedulePlace())
                .scheduleColor(basicSchedule.getScheduleColor())
                .scheduleComplete(basicSchedule.getScheduleComplete())
                .build();
    }

    public BasicSchedule updateSchedule(Long scheduleId, ScheduleDTO scheduleDTO) {
        Optional<BasicSchedule> optionalBasicSchedule = scheduleRepository.findById(scheduleId);
        if (optionalBasicSchedule.isEmpty()) {
            // 예외 처리 로직
            throw new RuntimeException("일정을 찾을 수 없습니다. scheduleId : " + scheduleId);
        }

        BasicSchedule basicSchedule = optionalBasicSchedule.get();
        BasicSchedule updatedSchedule = BasicSchedule.builder()
                .scheduleId(basicSchedule.getScheduleId())
                .scheduleType(scheduleDTO.getScheduleType() != null ? scheduleDTO.getScheduleType() : basicSchedule.getScheduleType())
                .scheduleTitle(scheduleDTO.getScheduleTitle() != null ? scheduleDTO.getScheduleTitle() : basicSchedule.getScheduleTitle())
                .scheduleAllTime(scheduleDTO.getScheduleAllTime() != null ? scheduleDTO.getScheduleAllTime() : basicSchedule.getScheduleAllTime())
                .scheduleStartDate(scheduleDTO.getScheduleStartDate() != null ? scheduleDTO.getScheduleStartDate() : basicSchedule.getScheduleStartDate())
                .scheduleStartTime(scheduleDTO.getScheduleStartTime() != null ? scheduleDTO.getScheduleStartTime() : basicSchedule.getScheduleStartTime())
                .scheduleEndDate(scheduleDTO.getScheduleEndDate() != null ? scheduleDTO.getScheduleEndDate() : basicSchedule.getScheduleEndDate())
                .scheduleEndTime(scheduleDTO.getScheduleEndTime() != null ? scheduleDTO.getScheduleEndTime() : basicSchedule.getScheduleEndTime())
                .scheduleAlarm(scheduleDTO.getScheduleAlarm() != null ? scheduleDTO.getScheduleAlarm() : basicSchedule.getScheduleAlarm())
                .schedulePlace(scheduleDTO.getSchedulePlace() != null ? scheduleDTO.getSchedulePlace() : basicSchedule.getSchedulePlace())
                .scheduleColor(scheduleDTO.getScheduleColor() != null ? scheduleDTO.getScheduleColor() : basicSchedule.getScheduleColor())
                .scheduleComplete(scheduleDTO.getScheduleComplete() != null ? scheduleDTO.getScheduleComplete() : basicSchedule.getScheduleComplete())
                .build();

        scheduleRepository.save(updatedSchedule);
        return updatedSchedule;
    }
}
