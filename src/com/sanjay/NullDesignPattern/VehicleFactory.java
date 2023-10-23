package com.sanjay.NullDesignPattern;

public class VehicleFactory {
	static Vehicle getVehicleObject(String typeOfVehicle) {
		if("CAR".equals(typeOfVehicle)) {
			return new Car();
		}
		return new Null();
	}
}
