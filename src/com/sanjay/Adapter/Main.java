package com.sanjay.Adapter;

public class Main {
	public static void main(String args[]) {
		WeightMachineAdapter weightForKgAdapter = new WeightForMan(new WeightMachineForbab());
		System.out.println(weightForKgAdapter.getWeightInKg());
	}
}
