package com.game.score.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.score.entity.Game;

public interface GameRepo extends JpaRepository<Game,Long>{

}
