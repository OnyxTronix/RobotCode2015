package org.usfirst.frc2231.RobotA2231.commands;

import org.usfirst.frc2231.RobotA2231.AutonomousConfig;
import org.usfirst.frc2231.RobotA2231.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Auto2Totes extends CommandGroup {
    
    public  Auto2Totes() {
    	
    	requires(Robot.driveTrain);
    	requires(Robot.stackevator);
    	requires(Robot.arms);
    	requires(Robot.collector);
    	
    	// First crate
    	addParallel(new InsertCrateCloseWheels());
    	addSequential(new AutoTurnRight(55 , AutonomousConfig.TURN_RIGHT_45_TIME));
    	//addParallel(new LiftToLevel1());
    	addSequential(new Wait(0.3));
    	addParallel(new CloseWheels());
    	addSequential(new ResetElevator());
    	addParallel(new LiftToLevel1());
    	addSequential(new Wait(0.37));
    	addParallel(new LiftToLevel1());
    	addSequential(new AutoDriveForward(57, 2));
    	addParallel(new LiftToLevel1());
    	addSequential(new AutoTurnLeft(75, 2)); //for overhauled auto
    	addSequential(new AutoDriveForward(73, 3));
    	///addSequential(new CloseWheels()); //for overhauled auto
    	
    	// Second crate
    	addSequential(new Wait(0.34));
    	addSequential(new InsertCrate());
    	addSequential(new ResetElevator());
    	addParallel(new LiftToLevel1());
    	addSequential(new AutoTurnRight(160, 2));
    	addSequential(new CloseWheels());
    	addParallel(new AutoDriveForward(165, 4));
    	addSequential(new ResetElevator());
    	//TODO close wheels, turn right, drive forwards

        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
