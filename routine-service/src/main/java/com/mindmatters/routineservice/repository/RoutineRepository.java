package main.java.com.mindmatters.routineservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import main.java.com.mindmatters.routineservice.model.Routine;
import java.util.List;

public interface RoutineRepository extends JpaRepository<Routine, Long> {
    List<Routine> findByUserId(String userId);

}
