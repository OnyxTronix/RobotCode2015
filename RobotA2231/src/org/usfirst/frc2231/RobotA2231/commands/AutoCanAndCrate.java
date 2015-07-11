package org.usfirst.frc2231.RobotA2231.commands;

import org.usfirst.frc2231.RobotA2231.AutonomousConfig;
import org.usfirst.frc2231.RobotA2231.Robot;

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
		addSequential(new CloseArms());
		addSequential(new LiftOverCan());
		addSequential(new AutoTurnLeft(15, 1));
		addSequential(new AutoDriveForward(12, 0.8)); //for overhauled auto
		addSequential(new InsertCrate());
		addSequential(new ResetElevator());
		addParallel(new LiftToLevel1());
		addSequential(new AutoTurnLeft(120, 2));
		addSequential(new AutoDriveForward(AutonomousConfig.DRIVE_TO_AUTO_ZONE_DISTANCE, AutonomousConfig.DRIVE_TO_AUTO_ZONE_TIME));
	}
}
