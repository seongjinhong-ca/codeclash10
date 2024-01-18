package example.codeclash10.domain.repositories;

import example.codeclash10.domain.entities.StudentCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCodeRepository extends JpaRepository<StudentCode, Integer> {
}
