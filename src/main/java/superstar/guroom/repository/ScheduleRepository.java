package superstar.guroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import superstar.guroom.entity.BasicSchedule;

@Repository
public interface ScheduleRepository extends JpaRepository<BasicSchedule, Long> {

}
