package com.game.score.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Task_Score")
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long score_id;
	
	private Long game_id;
	
	private String user_name;
	
	private int score;
	
	private LocalDateTime date_sumitted=java.time.LocalDateTime.now();

	public Long getScore_id() {
		return score_id;
	}

	public void setScore_id(Long score_id) {
		this.score_id = score_id;
	}

	public Long getGame_id() {
		return game_id;
	}

	public void setGame_id(Long game_id) {
		this.game_id = game_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LocalDateTime getDate_sumitted() {
		return date_sumitted;
	}

	public void setDate_sumitted(LocalDateTime date_sumitted) {
		this.date_sumitted = date_sumitted;
	}

	
	
	
	
	

}
