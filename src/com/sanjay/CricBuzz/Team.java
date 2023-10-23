package com.sanjay.CricBuzz;

import java.util.List;
import java.util.Queue;

public class Team {
	public String teamName;
	public Queue<PlayerDetails> playing11;
	public List<PlayerDetails> bench;
	public PlayerBattingController battingController;
	public PlayerBowlingController bowlingController;
	public boolean isWinner;
	public Team(String teamName, Queue<PlayerDetails> playing11, List<PlayerDetails> bench,
			PlayerBattingController battingController, PlayerBowlingController bowlingController, boolean isWinner) {
		this.teamName = teamName;
		this.playing11 = playing11;
		this.bench = bench;
		this.battingController = battingController;
		this.bowlingController = bowlingController;
		this.isWinner = isWinner;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Queue<PlayerDetails> getPlaying11() {
		return playing11;
	}
	public void setPlaying11(Queue<PlayerDetails> playing11) {
		this.playing11 = playing11;
	}
	public List<PlayerDetails> getBench() {
		return bench;
	}
	public void setBench(List<PlayerDetails> bench) {
		this.bench = bench;
	}
	public PlayerBattingController getBattingController() {
		return battingController;
	}
	public void setBattingController(PlayerBattingController battingController) {
		this.battingController = battingController;
	}
	public PlayerBowlingController getBowlingController() {
		return bowlingController;
	}
	public void setBowlingController(PlayerBowlingController bowlingController) {
		this.bowlingController = bowlingController;
	}
	public boolean isWinner() {
		return isWinner;
	}
	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}
	
}

