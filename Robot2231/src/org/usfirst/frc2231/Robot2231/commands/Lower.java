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

import org.usfirst.frc2231.Robot2231.Robot;

/**
 *
 */
public class  Lower extends GeneralStackevatorCommand{

    public Lower() {
        super();
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.stackevator.lower();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
}
