package com.sanjay.CricBuzz;

import java.sql.Date;

public class Match {
	Team teamA;
	Team teamB;
	Date matchDate;
	String venue;
	Team tossWinner;
	InningDetails[] innings;
	MatchType matchType;
	public Match(Team teamA, Team teamB, Date matchDate, String venue,
			MatchType matchType) {
		this.teamA = teamA;
		this.teamB = teamB;
		this.matchDate = matchDate;
		this.venue = venue;
		
		this.innings = innings = new InningDetails[2];
		this.matchType = matchType;
	}
	
}
