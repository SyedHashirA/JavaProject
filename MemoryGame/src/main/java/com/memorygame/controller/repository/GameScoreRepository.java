package main.java.com.memorygame.controller.repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameScoreRepository extends JpaRepository<GameScore, Long> {
    // Define custom query methods if needed
}
