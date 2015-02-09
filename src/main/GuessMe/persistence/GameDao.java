package main.GuessMe.persistence;

import main.GuessMe.model.Game;

public interface GameDao {

	public abstract Game findById(String id);

	public abstract void save(Game game);

}