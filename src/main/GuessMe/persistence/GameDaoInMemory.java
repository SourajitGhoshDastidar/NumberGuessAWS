package main.GuessMe.persistence;

import main.GuessMe.model.Game;
import main.GuessMe.util.*;

public class GameDaoInMemory implements GameDao {
	
	private SimpleLRUCache cache;
	
	public GameDaoInMemory(SimpleLRUCache cache) {
		this.cache = cache;
	}

	@Override
	public void save(Game game) {
		cache.put(game.getId(), game);
	}
	
	@Override
	public Game findById(String id) {
		if (id==null) {
			return null;
		}
		return (Game) cache.get(id);
	}
}