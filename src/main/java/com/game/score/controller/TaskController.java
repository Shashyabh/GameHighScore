package com.game.score.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.game.score.entity.Game;
import com.game.score.entity.Score;
import com.game.score.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	TaskService tService;
	
	@PostMapping("/addGame")
	public Game addGame(@RequestBody Game game) {
		return tService.addGame(game);
	}
	
	@PostMapping("/addScore")
	public Score addScore(@RequestBody Score score) {
		return tService.addScore(score);
	}
	
	@GetMapping("/highScores/{game_id}")
	public List<Integer> highScores(@PathVariable Long game_id,@RequestParam int limit){
		return tService.highScores(game_id,10);
	}
	
	@GetMapping("/personalHighScore")
	public int personalHighScore(@RequestParam String user_name,@RequestParam Long game_id) {
		return tService.personalHighScore(user_name,game_id);
	}

}
