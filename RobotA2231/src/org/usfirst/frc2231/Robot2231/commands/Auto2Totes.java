package org.usfirst.frc2231.Robot2231.commands;

import org.usfirst.frc2231.Robot2231.Robot;

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
    	
    	addSequential(new ResetElevator());
    	addSequential(new AutoTurnRightWithTime(0.60));
    	addSequential(new AutoDriveForwardWithTime(0.1));
    	addParallel(new LiftToLevel1());
    	addSequential(new AutoTurnLeftWithTime(1.0));
    	addSequential(new AutoDriveForwardWithTime(1));
    	addSequential(new AutoTurnLeftWithTime(1.5));
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
