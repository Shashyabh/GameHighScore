package com.game.score.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.game.score.entity.Score;

public interface ScoreRepo extends JpaRepository<Score,Long>{
    
	@Query(value="select s.score from Task_Score s where s.game_id =:game_id order by s.score desc LIMIT :limit", nativeQuery=true)
	public List<Integer> highScores(@Param("game_id") Long game_id , @Param("limit") int limit);
	
	@Query(value="select max(s.score) from Task_Score s where s.game_id =:game_id and s.user_name =:user_name",nativeQuery=true)
	public int personalHighScore(@Param("user_name") String user_name, @Param("game_id") Long game_id);
}
