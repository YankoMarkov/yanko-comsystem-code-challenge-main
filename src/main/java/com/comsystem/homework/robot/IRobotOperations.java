package com.comsystem.homework.robot;

import com.comsystem.homework.model.RobotPlan;

public interface IRobotOperations {
	
	RobotPlan excavateStonesForDays(int days);
	
	RobotPlan daysRequiredToCollectStones(int numberOfStones);
}
