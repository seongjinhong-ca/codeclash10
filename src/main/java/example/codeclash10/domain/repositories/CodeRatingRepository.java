package example.codeclash10.domain.repositories;

import example.codeclash10.domain.entities.CodeRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeRatingRepository extends JpaRepository<CodeRating, Integer> {
}
