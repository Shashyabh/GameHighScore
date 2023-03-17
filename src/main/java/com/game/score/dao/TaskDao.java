package com.game.score.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.game.score.entity.Game;
import com.game.score.entity.Score;
import com.game.score.repository.GameRepo;
import com.game.score.repository.ScoreRepo;

@Repository
public class TaskDao {
	
   @Autowired
   ScoreRepo sRepo;
   
   @Autowired
   GameRepo gRepo;
   
   
   public Game addGame(Game game) {
		return gRepo.save(game);
	}
	

	public Score addScore(Score score) {
		return sRepo.save(score);
	}
	

	public List<Integer> highScores(Long game_id , int limit){
		return sRepo.highScores(game_id,limit);
	}
	
	
	public int personalHighScore(String user_name,Long game_id) {
		return sRepo.personalHighScore(user_name,game_id);
	}
   
   
   
}
