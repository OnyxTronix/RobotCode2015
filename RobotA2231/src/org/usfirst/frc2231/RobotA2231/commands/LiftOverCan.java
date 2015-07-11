package org.usfirst.frc2231.RobotA2231.commands;

import org.usfirst.frc2231.RobotA2231.AutonomousConfig;
import org.usfirst.frc2231.RobotA2231.subsystems.Stackevator;

public class LiftOverCan extends GeneralSetpointCommand {

	public LiftOverCan()
	{
		super();
		setPoint = Stackevator.LEVEL_CAN_POSITION;
		maxTimeout = AutonomousConfig.LIFT_OVER_CAN_TIME;
	}
}
