package main.java.com.memorygame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import main.java.com.memorygame.controller.repository.GameScoreRepository;

@RestController
@RequestMapping("/api")
public class GameController {

    @Autowired
    private GameScoreRepository gameScoreRepository;

    @PostMapping("/scores")
    public void saveScore(@RequestBody GameScore gameScore) {
        gameScoreRepository.save(gameScore);
    }
}