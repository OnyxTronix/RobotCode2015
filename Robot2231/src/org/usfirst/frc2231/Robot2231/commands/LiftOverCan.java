package org.usfirst.frc2231.Robot2231.commands;

import org.usfirst.frc2231.Robot2231.subsystems.Stackevator;

public class LiftOverCan extends GeneralSetpointCommand {

	public LiftOverCan()
	{
		super();
		setPoint = Stackevator.LEVEL_CAN;
		maxTimeout = 3;
	}
}
