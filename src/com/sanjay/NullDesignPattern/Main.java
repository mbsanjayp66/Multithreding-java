package com.sanjay.NullDesignPattern;

public class Main {

	public static void main(String[] args) {
		Vehicle obj = VehicleFactory.getVehicleObject("CAR");
		Vehicle obj2 = VehicleFactory.getVehicleObject("bike");
		System.out.println("Tank:"+obj.getSeatingCapacity());
		System.out.println("Tank:"+obj2.getSeatingCapacity());
	}

}
