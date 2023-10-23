package com.sanjay.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
	private static Map<String, IRobot>roboticObjectCache = new HashMap<>();
	
	public static IRobot createObject(String type) {
		if(roboticObjectCache.containsKey(type)) {
			return roboticObjectCache.get(type);
		}else {
			if(type.equals("Humanoid")) {
				IRobot iRobot = new Humanoid(type, new Sprite());
				roboticObjectCache.put(type, iRobot);
				return iRobot;
			}else {
				IRobot iRobot = new RoboticDog(type, new Sprite());
				roboticObjectCache.put(type, iRobot);
				return iRobot;
			}
		}
	}
}
