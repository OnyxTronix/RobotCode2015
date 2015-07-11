package org.usfirst.frc2231.RobotA2231.commands;

import org.usfirst.frc2231.RobotA2231.AutonomousConfig;
import org.usfirst.frc2231.RobotA2231.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoDriveToAutoZone extends CommandGroup {

	public AutoDriveToAutoZone() {
		requires(Robot.driveTrain);
		requires(Robot.stackevator);
		requires(Robot.arms);
		requires(Robot.collector);

		addSequential(new AutoDriveForward(AutonomousConfig.DRIVE_TO_AUTO_ZONE_DISTANCE, AutonomousConfig.DRIVE_TO_AUTO_ZONE_TIME));

	}
}
