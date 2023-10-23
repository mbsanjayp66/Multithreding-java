package com.sanjay.CricBuzz;

public class T20MatchType implements MatchType {

	@Override
    public int noOfOvers() {
        return 50;
    }

    @Override
    public int maxOverCountBowlers() {
        return 10;
    }


}
