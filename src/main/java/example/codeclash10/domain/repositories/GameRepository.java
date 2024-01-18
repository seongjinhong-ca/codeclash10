package example.codeclash10.domain.repositories;

import example.codeclash10.domain.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
    // Additional custom query methods can be added here if needed
}