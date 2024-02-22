package repository;

import entity.Calender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// <Entity의 타입 클래스, pk값의 타입>
@Repository
public interface CalenderRepository extends JpaRepository<Calender, Long> {

}
