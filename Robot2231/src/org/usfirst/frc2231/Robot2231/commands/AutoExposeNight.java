package org.usfirst.frc2231.Robot2231.commands;

import org.usfirst.frc2231.Robot2231.AutonomousConfig;
import org.usfirst.frc2231.Robot2231.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoExposeNight extends CommandGroup {

	public AutoExposeNight() {
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.
		requires(Robot.driveTrain);
		requires(Robot.stackevator);
		requires(Robot.arms);
		requires(Robot.collector);

		addSequential(new ResetElevator());
		addSequential(new LiftToLevel1());
		addSequential(new AutoDriveForward(90, 1));
		addSequential(new InsertCrate());
		addSequential(new ResetElevator());
		addSequential(new LiftToLevel1());
		addSequential(new AutoDriveForward(90, 1));
		addSequential(new InsertCrate());
		addSequential(new ResetElevator());
		
		addSequential(new AutoTurnLeft(90,
				2.2 * AutonomousConfig.TURN_RIGHT_TIME));
		addSequential(new AutoDriveForward(200, 2));
	}
}
