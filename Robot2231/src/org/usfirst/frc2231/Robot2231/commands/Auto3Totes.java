package org.usfirst.frc2231.Robot2231.commands;

import org.usfirst.frc2231.Robot2231.AutonomousConfig;
import org.usfirst.frc2231.Robot2231.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto3Totes extends CommandGroup {
	    
		public  Auto3Totes() {
	        // Add Commands here:
	        // e.g. addSequential(new Command1());
	        //      addSequential(new Command2());
	        // these will run in order.
	    	requires(Robot.driveTrain);
	    	requires(Robot.stackevator);
	    	requires(Robot.arms);
	    	requires(Robot.collector);
	    	
	    	//addSequential(new LiftToLevel1());
	    	//addSequential(new InsertCrate());
	    	addSequential(new ResetElevator());
	    	addParallel(new LiftToLevel1());
	    	addSequential(new AutoTurnRight(45, 0.8)); //for overhauled auto
	    	
	    	///addSequential(new CloseWheels()); //for overhauled auto
	    	addSequential(new AutoDriveForward(100, 1.5)); //remove for overhauled auto
	    	addSequential(new AutoTurnLeft(180, 0.9));
	    	addSequential(new AutoDriveForward(130, 1.2));
	    	addSequential(new InsertCrate());
	    	addSequential(new ResetElevator());
	    	addSequential(new LiftToLevel1());
	    	addParallel(new AutoTurnRight(50, 1.4*AutonomousConfig.TURN_RIGHT_TIME));
	    	addSequential(new AutoDriveForward(100, 1.5)); //remove for overhauled auto
	    	addSequential(new AutoTurnLeft(180, 0.9));
	    	addSequential(new AutoDriveForward(130, 1.35));
	    	addSequential(new InsertCrate());
	    	addSequential(new ResetElevator());
	    	addParallel(new AutoTurnRight(90, 2.2*AutonomousConfig.TURN_RIGHT_TIME));
	    	addSequential(new AutoDriveForward(200, 2));
	    	addSequential(new AutoDriveForward(200, 2));
	    	//addParallel(new ResetElevator());
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
