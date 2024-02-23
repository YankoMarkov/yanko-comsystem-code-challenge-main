package com.comsystem.homework.utils;

import com.comsystem.homework.model.RobotAction;

import java.util.ArrayList;
import java.util.List;

public class TestUtils {
	
	public static List<RobotAction> getRobotActionsList(int number) {
		List<RobotAction> robotActions = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				robotActions.add(RobotAction.CLONE);
			} else {
				robotActions.add(RobotAction.DIG);
			}
		}
		return robotActions;
	}
}
