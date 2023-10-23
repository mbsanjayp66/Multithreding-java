package com.sanjay.SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
	Board board;
	Dice dice;
	Deque<Player>players = new LinkedList<>();
	Player winner;
	
	public Game() {
		initializeGame();
	}

	private void initializeGame() {
		board = new Board(10, 5, 4);
		dice = new Dice(1);
		winner = null;
		addPlayers();
	}

	private void addPlayers() {
		Player p1 = new Player("Sanjay", 0);
		Player p2 = new Player("Pankaj", 0);
		players.add(p2);
		players.add(p1);
	}
	
	public void startGame() {
		while(winner==null) {
				
		}
	}
	
}
