// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2231.testingPIDelevator.subsystems;

import org.usfirst.frc2231.testingPIDelevator.RobotMap;
import org.usfirst.frc2231.testingPIDelevator.commands.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.communication.FRCNetworkCommunicationsLibrary.tModuleType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Stackevator extends PIDSubsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput bottom = RobotMap.stackevatorbottom;
    Encoder encoder = RobotMap.stackevatorencoder;
    SpeedController motor = RobotMap.stackevatormotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    final double LOWER_SPEED = -0.2;
    final double RAISE_SPEED = 0.6;
    
    public static final double LEVEL_1_POSITION = 450;
    public static final double LEVEL_2_POSITION = 950;
    public static final double GOING_DOWN_OFFSET = 50;
    
    boolean isCalibrated = false;
    
    // Initialize your subsystem here
    public Stackevator() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        super("Stackevator", 0.2, 0.1, 0.07);
        setAbsoluteTolerance(3.0);
        getPIDController().setContinuous(false);
        LiveWindow.addActuator("Stackevator", "PIDSubsystem Controller", getPIDController());
        getPIDController().setOutputRange(-0.2, 0.7);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new LiftByJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
        return encoder.pidGet();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
        motor.pidWrite(output);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
    }
    
    public boolean getCalibrated(){
    	//@summary: return if the system is calibrated
    	return isCalibrated;
    }
    
    public void setCalibrated(boolean newValue) {
    	//@summary: sets the calibration state of the system
		isCalibrated = true;
	}
    
    public void lower() {
    	//@summary: lowers the system if the system hasn't reached the bottom
    	if (!reachedBottom()) {
    		motor.set(LOWER_SPEED);
    	}
	}
    
    public void raise() {
    	//@summary: raises the system TODO: add condition when top microswitch is attached
    	motor.set(RAISE_SPEED);
	}
    
    public boolean reachedBottom() {
    	//@summary: returns if the system is at the bottom(by microswitch value)
    	return !bottom.get();
	}
    
    public void stop() {
    	//@summary: stops the motor and the PID system  
    	motor.disable();
    	disable();
		
	}
    
    public void setByJoystick(Joystick stick) {
    	//@summary: move the system manually by with a joystick
    	motor.set(stick.getRawAxis(3)-stick.getRawAxis(2));
	}
    
    public void resetEncoder() {
    	//@summary: resets the encoder
		encoder.reset();
	}
}
