package org.usfirst.frc2231.RobotA2231.commands;

import org.usfirst.frc2231.RobotA2231.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class OpenWheelsSpinOut extends CommandGroup {

	public OpenWheelsSpinOut()
	{
		requires(Robot.driveTrain);
    	requires(Robot.stackevator);
    	requires(Robot.arms);
    	requires(Robot.collector);
    	
    	addParallel(new CloseWheels());
    	addSequential(new RemoveWithWheels());
	}
}
