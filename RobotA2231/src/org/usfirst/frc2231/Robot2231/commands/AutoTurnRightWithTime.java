// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2231.Robot2231.commands;

import org.usfirst.frc2231.Robot2231.AutonomousConfig;
import org.usfirst.frc2231.Robot2231.Robot;

/**
 *
 */
public class  AutoTurnRightWithTime extends RotateRight {
	private double _timeout;
    public AutoTurnRightWithTime(double timeout) {    	
    	super();
    	_timeout = timeout;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(_timeout);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }
}
