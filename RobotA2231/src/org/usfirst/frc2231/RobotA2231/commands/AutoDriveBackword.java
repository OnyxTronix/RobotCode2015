package org.usfirst.frc2231.RobotA2231.commands;

import org.usfirst.frc2231.RobotA2231.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDriveBackword extends Command {

	private double distanceToMove;
	private double maxTimeout;
    public AutoDriveBackword(double distance, double timeout) {    	
    	distanceToMove = distance;
    	maxTimeout = timeout;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveTrain.initializeEncoders();
    	setTimeout(maxTimeout);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return Math.abs(Robot.driveTrain.posRight()) >= distanceToMove || isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.driveTrain.backward();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
}
