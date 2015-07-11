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

import org.usfirst.frc2231.Robot2231.commands.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.tables.ITable;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton rotateLeftButton;
    public JoystickButton rotateRightButton;
    public JoystickButton insertCrateButton;
    public JoystickButton stopWheelsButton;
    public JoystickButton closeWheelsButton;
    public JoystickButton openWheelsButton;
    public Joystick driveStick;
    public JoystickButton resetButton;
    public JoystickButton level2;
    public JoystickButton liftWithJoystickButton;
    public JoystickButton level1;
    public JoystickButton open;
    public JoystickButton close;
    public JoystickButton startComp;
    public JoystickButton stopComp;
    public Joystick functionStick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        functionStick = new Joystick(2);
        
        stopComp = new JoystickButton(functionStick, 7);
        stopComp.whenPressed(new StopCompressor());
        startComp = new JoystickButton(functionStick, 8);
        startComp.whenPressed(new StartCompressor());
        close = new JoystickButton(functionStick, 6);
        close.whenPressed(new CloseArms());
        open = new JoystickButton(functionStick, 5);
        open.whenPressed(new OpenArms());
        level1 = new JoystickButton(functionStick, 3);
        level1.whenPressed(new LiftToLevel1());
        liftWithJoystickButton = new JoystickButton(functionStick, 2);
        liftWithJoystickButton.whenPressed(new LiftByJoystick());
        level2 = new JoystickButton(functionStick, 4);
        level2.whenPressed(new LiftToLevel2());
        resetButton = new JoystickButton(functionStick, 1);
        resetButton.whenPressed(new ResetElevator());
        driveStick = new Joystick(1);
        
        openWheelsButton = new JoystickButton(driveStick, 4);
        openWheelsButton.whenPressed(new OpenWheels());
        closeWheelsButton = new JoystickButton(driveStick, 3);
        closeWheelsButton.whenPressed(new CloseWheels());
        stopWheelsButton = new JoystickButton(driveStick, 2);
        stopWheelsButton.whenPressed(new StopCollectorWheels());
        insertCrateButton = new JoystickButton(driveStick, 1);
        insertCrateButton.whenPressed(new InsertCrate());
        rotateRightButton = new JoystickButton(driveStick, 6);
        rotateRightButton.whileHeld(new RotateRight());
        rotateLeftButton = new JoystickButton(driveStick, 5);
        rotateLeftButton.whileHeld(new RotateLeft());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("StartCompressor", new StartCompressor());

        SmartDashboard.putData("StopCompressor", new StopCompressor());

        SmartDashboard.putData("OpenArms", new OpenArms());

        SmartDashboard.putData("CloseArms", new CloseArms());

        SmartDashboard.putData("InsertWithWheels", new InsertWithWheels());

        SmartDashboard.putData("RemoveWithWheels", new RemoveWithWheels());

        SmartDashboard.putData("OpenWheels", new OpenWheels());

        SmartDashboard.putData("CloseWheels", new CloseWheels());

        SmartDashboard.putData("StopCollectorWheels", new StopCollectorWheels());

        SmartDashboard.putData("Turn90DegreesRight", new Turn90DegreesRight());

        SmartDashboard.putData("DriveToAutozone", new DriveToAutozone());

        SmartDashboard.putData("Auto1Tote", new Auto1Tote());

        SmartDashboard.putData("InsertCrate", new InsertCrate());

        SmartDashboard.putData("OpenAndCloseWheels", new OpenAndCloseWheels());

        SmartDashboard.putData("AutoInsertAndLiftToLevel1", new AutoInsertAndLiftToLevel1());

        SmartDashboard.putData("AutoInsertAndLifeToLevel2", new AutoInsertAndLifeToLevel2());

        SmartDashboard.putData("AutoAllBoxes", new AutoAllBoxes());

        SmartDashboard.putData("AutoDriveToBox", new AutoDriveToBox());

        SmartDashboard.putData("AutoTurnLeft", new AutoTurnLeft());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        SmartDashboard.putNumber("autonomousConfig", 1);
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getdriveStick() {
        return driveStick;
    }

    public Joystick getfunctionStick() {
        return functionStick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
