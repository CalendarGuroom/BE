package superstar.guroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import superstar.guroom.entity.Calender;

import java.util.List;

// <Entity의 타입 클래스, pk값의 타입>
@Repository
public interface CalenderRepository extends JpaRepository<Calender, Long> {
    public Calender findByCalenderCode(String calenderCode);
}
