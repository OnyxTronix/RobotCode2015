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
public class Collector extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Solenoid openWheels = RobotMap.collectoropenWheels;
    Solenoid closeWheels = RobotMap.collectorcloseWheels;
    SpeedController leftWheel = RobotMap.collectorleftWheel;
    SpeedController rightWheel = RobotMap.collectorrightWheel;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    boolean isOpened;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void changeWheelsState(boolean toOpen)
    {
    	if (toOpen)
    	{
    		openWheels.set(true);
    		closeWheels.set(false);
    		isOpened = true;
    	}
    	else
    	{
    		openWheels.set(false);
    		closeWheels.set(true);
    		isOpened = false;
    	}
    }
    
    public void spinWheelsInside(boolean inside)
    {
    	if (inside)
    	{
    		rightWheel.set(-1);
    		leftWheel.set(1);
    	}
    	else
    	{
    		leftWheel.set(-1);
    		rightWheel.set(1);
    	}
    }
    
    public void stopWheels()
    {
    	rightWheel.set(0);
    	leftWheel.set(0);
    }
    
    public boolean isOpened()
    {
    	return isOpened;
    }
}
