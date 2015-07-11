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


/**
 *
 */
public class RangeFinder extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    AnalogInput rangeFinder = RobotMap.rangeFinderrangeFinder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public double getRange() {
    	final double suppliedVoltage=5;
    	double voltsPerInch=suppliedVoltage/512;
    	return rangeFinder.getAverageVoltage()/voltsPerInch;
    	//return rangeFinder.getVoltage()/(1.48112*Math.pow(10, -3));
    }
    
    
    public double getVoltage() { 
    	return rangeFinder.getVoltage();
    }
}