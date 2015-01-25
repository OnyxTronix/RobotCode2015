// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2231.Robot2231;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainfrontLeft;
    public static SpeedController driveTrainfrontRight;
    public static SpeedController driveTrainrearLeft;
    public static SpeedController driveTrainrearRight;
    public static RobotDrive driveTraindrive;
    public static AnalogInput stackevatorrangeFinder;
    public static DigitalInput stackevatorbottom;
    public static Encoder stackevatorencoder;
    public static SpeedController stackevatormotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static BuiltInAccelerometer mainAccelerometer;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainfrontLeft = new Talon(3);
        LiveWindow.addActuator("DriveTrain", "frontLeft", (Talon) driveTrainfrontLeft);
        
        driveTrainfrontRight = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "frontRight", (Talon) driveTrainfrontRight);
        
        driveTrainrearLeft = new Talon(2);
        LiveWindow.addActuator("DriveTrain", "rearLeft", (Talon) driveTrainrearLeft);
        
        driveTrainrearRight = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "rearRight", (Talon) driveTrainrearRight);
        
        driveTraindrive = new RobotDrive(driveTrainfrontLeft, driveTrainrearLeft,
              driveTrainfrontRight, driveTrainrearRight);
        
        driveTraindrive.setSafetyEnabled(true);
        driveTraindrive.setExpiration(0.1);
        driveTraindrive.setSensitivity(0.5);
        driveTraindrive.setMaxOutput(1.0);

        stackevatorrangeFinder = new AnalogInput(0);
        LiveWindow.addSensor("Stackevator", "rangeFinder", stackevatorrangeFinder);
        
        stackevatorbottom = new DigitalInput(6);
        LiveWindow.addSensor("Stackevator", "bottom", stackevatorbottom);
        
        stackevatorencoder = new Encoder(7, 8, false, EncodingType.k4X);
        LiveWindow.addSensor("Stackevator", "encoder", stackevatorencoder);
        stackevatorencoder.setDistancePerPulse(1.0);
        stackevatorencoder.setPIDSourceParameter(PIDSourceParameter.kDistance);
        stackevatormotor = new Victor(4);
        LiveWindow.addActuator("Stackevator", "motor", (Victor) stackevatormotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        mainAccelerometer = new BuiltInAccelerometer();
        LiveWindow.addSensor("DriveTrain", "Main Accelerometer", mainAccelerometer);
        
        
    }
}
