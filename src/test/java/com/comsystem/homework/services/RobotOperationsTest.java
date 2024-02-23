package com.comsystem.homework.services;

import com.comsystem.homework.model.RobotAction;
import com.comsystem.homework.model.RobotPlan;
import com.comsystem.homework.robot.RobotOperations;
import com.comsystem.homework.utils.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RobotOperationsTest {
	
	private RobotOperations robotOperations;
	
	@BeforeEach
	void setUp() {
		robotOperations = new RobotOperations();
	}
	
	@Test
	void excavateStonesForDays_whenNumberOfDays_isNegativeNumber_return_Exception() {
		assertThrows(IllegalArgumentException.class, () -> robotOperations.excavateStonesForDays(-3));
	}
	
	@Test
	void excavateStonesForDays_whenNumberOfDays_is_0_return_RobotAction() {
		RobotPlan expectedRobotPlan = new RobotPlan(0, 0, new ArrayList<>());
		RobotPlan testRobotPlan = robotOperations.excavateStonesForDays(0);
		
		assertEquals(expectedRobotPlan.numberOfDays(), testRobotPlan.numberOfDays());
		assertEquals(expectedRobotPlan.numberOfStones(), testRobotPlan.numberOfStones());
		assertEquals(expectedRobotPlan.robotActions(), testRobotPlan.robotActions());
	}
	
	@Test
	void excavateStonesForDays_whenNumberOfDays_is_5_return_RobotAction() {
		List<RobotAction> expectedRobotActions = TestUtils.getRobotActionsList(5);
		RobotPlan expectedRobotPlan = new RobotPlan(5, 3, expectedRobotActions);
		RobotPlan testRobotPlan = robotOperations.excavateStonesForDays(5);
		
		assertEquals(expectedRobotPlan.numberOfDays(), testRobotPlan.numberOfDays());
		assertEquals(expectedRobotPlan.numberOfStones(), testRobotPlan.numberOfStones());
		assertEquals(expectedRobotPlan.robotActions(), testRobotPlan.robotActions());
	}
	
	@Test
	void daysRequiredToCollectStones_whenNumberOfStones_isNegativeNumber_return_Exception() {
		assertThrows(IllegalArgumentException.class, () -> robotOperations.daysRequiredToCollectStones(-3));
	}
	
	@Test
	void daysRequiredToCollectStones_whenNumberOfStones_is_0_return_RobotAction() {
		RobotPlan expectedRobotPlan = new RobotPlan(0, 0, new ArrayList<>());
		RobotPlan testRobotPlan = robotOperations.daysRequiredToCollectStones(0);
		
		assertEquals(expectedRobotPlan.numberOfDays(), testRobotPlan.numberOfDays());
		assertEquals(expectedRobotPlan.numberOfStones(), testRobotPlan.numberOfStones());
		assertEquals(expectedRobotPlan.robotActions(), testRobotPlan.robotActions());
	}
	
	@Test
	void daysRequiredToCollectStones_whenNumberOfStones_is_5_return_RobotAction() {
		List<RobotAction> expectedRobotActions = TestUtils.getRobotActionsList(9);
		RobotPlan expectedRobotPlan = new RobotPlan(9, 5, expectedRobotActions);
		RobotPlan testRobotPlan = robotOperations.daysRequiredToCollectStones(5);
		
		assertEquals(expectedRobotPlan.numberOfDays(), testRobotPlan.numberOfDays());
		assertEquals(expectedRobotPlan.numberOfStones(), testRobotPlan.numberOfStones());
		assertEquals(expectedRobotPlan.robotActions(), testRobotPlan.robotActions());
	}
}