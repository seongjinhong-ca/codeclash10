package example.codeclash10.domain.repositories;

import example.codeclash10.domain.entities.Round;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoundRepository extends JpaRepository<Round, Integer> {
}
