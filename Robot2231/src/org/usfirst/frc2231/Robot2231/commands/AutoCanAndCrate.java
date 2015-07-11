package org.usfirst.frc2231.Robot2231.commands;

import org.usfirst.frc2231.Robot2231.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoCanAndCrate extends CommandGroup {

	public AutoCanAndCrate()
	{
		requires(Robot.driveTrain);
		requires(Robot.stackevator);
		requires(Robot.arms);
		requires(Robot.collector);
		
		//addSequential(new LiftToLevel1());
		//addSequential(new InsertCrate());
		addSequential(new ResetElevator());
		addSequential(new CloseWheels());
		addSequential(new LiftOverCan());
		addSequential(new AutoDriveForward(45, 0.8)); //for overhauled auto
		addSequential(new AutoTurnLeft(90, 1));
		addSequential(new AutoDriveForward(250, 4));
	}
}
