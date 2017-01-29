package org.usfirst.frc.team2557.robot.commands;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDriveCommand extends Command {
	double x;
	double y;
	double z;
	boolean truefalse;

	
    public AutoDriveCommand(double a, double b, double c) {
    	x = a;
    	y = b;
    	z = c;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
   

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {   	
    	Robot.autoSubsystem.setDistances(x, y, z);
    	if(RobotMap.backLeft.getEncPosition() >= z){
    		truefalse = true;
    	}
    }
    	
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return truefalse || (RobotMap.backLeft.getEncPosition() >= z);
    	}
		
    

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.backLeft.setEncPosition(0);
    	RobotMap.robotDrive.arcadeDrive(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
