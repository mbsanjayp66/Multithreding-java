package com.sanjay.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
	Cell[][] cells;
	
	public Board(int boardSize,int numberOfSnakes,int numberOfLadders) {
		cells = new Cell[boardSize][boardSize];
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				cells[i][j] = new Cell();
			}
		}
		addSnakesLadders(numberOfSnakes,numberOfLadders);
	}

	private void addSnakesLadders(int numberOfSnakes, int numberOfLadders) {
		while(numberOfSnakes>0) {
			int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
			int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
			if(snakeTail>=snakeHead) {
				continue;
			}
			Jump snakeObJ = new Jump();
			snakeObJ.start = snakeHead;
			snakeObJ.end = snakeTail;
			
			Cell cell = getCell(snakeHead);
			cell.jump = snakeObJ;
			numberOfSnakes--;
		}
		
		while(numberOfLadders>0) {
			int LadderHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
			int LadderTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
			if(LadderHead>=LadderTail) {
				continue;
			}
			Jump LadderObJ = new Jump();
			LadderObJ.start = LadderHead;
			LadderObJ.end = LadderTail;
			
			Cell cell = getCell(LadderHead);
			cell.jump = LadderObJ;
			numberOfLadders--;
		}
	}
	Cell getCell(int playerPosition) {
		int boardRow = playerPosition/cells.length;
		int boardCol = playerPosition%cells.length;
		return cells[boardRow][boardCol];
	}
	
}
