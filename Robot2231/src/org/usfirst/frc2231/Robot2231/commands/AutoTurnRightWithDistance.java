package org.usfirst.frc2231.Robot2231.commands;

import org.usfirst.frc2231.Robot2231.Robot;
import org.usfirst.frc2231.utils.Direction;

import edu.wpi.first.wpilibj.command.Command;

public class  AutoTurnRightWithDistance extends Command{
	private double angleToTurnRight;
    public AutoTurnRightWithDistance(double angle) {    	
    	angleToTurnRight = angle;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveTrain.initializeEncoders();
    }

    protected void execute(){
    	Robot.driveTrain.turn(Direction.RIGHT);
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.driveTrain.posRight() <= -59.5 * (angleToTurnRight / 360) * Math.PI;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }
    
    protected void interrupted(){
    }
}
