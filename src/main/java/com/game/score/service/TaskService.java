package com.game.score.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.game.score.dao.TaskDao;
import com.game.score.entity.Game;
import com.game.score.entity.Score;

@Service
public class TaskService {

	
	@Autowired
	TaskDao tDao;
	
	public Game addGame(Game game) {
		return tDao.addGame(game);
	}
	

	public Score addScore(Score score) {
		return tDao.addScore(score);
	}
	

	public List<Integer> highScores(Long game_id, int limit){
		return tDao.highScores(game_id,limit);
	}
	
	
	public int personalHighScore(String user_name,Long game_id) {
		return tDao.personalHighScore(user_name,game_id);
	}

}
