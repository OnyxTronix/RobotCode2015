// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2231.testingPIDelevator.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2231.testingPIDelevator.Robot;
import org.usfirst.frc2231.testingPIDelevator.subsystems.Stackevator;

/**
 *
 */
public class  LiftToLevel2 extends Command {

    public LiftToLevel2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.stackevator);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.stackevator.setSetpoint(Stackevator.LEVEL_2_POSITION);
    	Robot.stackevator.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Math.abs(Robot.stackevator.getSetpoint() - Robot.stackevator.getPosition()) < Stackevator.POSITION_TOLERANCE ;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.stackevator.disable();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.stackevator.disable();
    }
}
