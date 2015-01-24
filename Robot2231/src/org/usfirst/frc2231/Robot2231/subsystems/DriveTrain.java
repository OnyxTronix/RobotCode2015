// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2231.Robot2231.subsystems;

import org.usfirst.frc2231.Robot2231.RobotMap;
import org.usfirst.frc2231.Robot2231.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc2231.utils.*;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController frontLeft = RobotMap.driveTrainfrontLeft;
    SpeedController frontRight = RobotMap.driveTrainfrontRight;
    SpeedController rearLeft = RobotMap.driveTrainrearLeft;
    SpeedController rearRight = RobotMap.driveTrainrearRight;
    RobotDrive drive = RobotMap.driveTraindrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    BuiltInAccelerometer mainAccelerometer = RobotMap.mainAccelerometer;
    
    double DRIVE_MAGNITUDE = 1.0;
    int LEFT_AXIS_INDEX = 1;
	int RIGHT_AXIS_INDEX = 4;


    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void turn(Direction direction) {
    	// @param direction: the direction to turn, LEFT or RIGHT
		drive.drive(DRIVE_MAGNITUDE, direction.value);
	}
    
    public void arcadeDrive(Joystick stick) {
    	drive.arcadeDrive(stick.getRawAxis(LEFT_AXIS_INDEX), -stick.getRawAxis(RIGHT_AXIS_INDEX));
	}
    
    
    public void tankDrive(double leftValue, double rightValue) {
    	drive.tankDrive(leftValue, rightValue);
		
	}
}

