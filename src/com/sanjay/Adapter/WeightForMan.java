package com.sanjay.Adapter;

public class WeightForMan implements WeightMachineAdapter {
	Weight weight;
	public WeightForMan(Weight w) {
		this.weight = w;
	}
	
	@Override
	public double getWeightInKg() {
		return weight.getWeightInPound()+200;
	}

}
