package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutoSubsystem extends Subsystem {
	
	public void AutoSub(){
//		RobotMap.rightDriveEncoder.reset();
		
		/*while(RobotMap.rightDriveEncoder.get() >= -1850 && RobotMap.leftDriveEncoder.get() >= -1850){
			RobotMap.robotDrive.arcadeDrive(0,0.5);
			SmartDashboard.putNumber("encoderCount", RobotMap.rightDriveEncoder.get());
		}
		while(RobotMap.rightDriveEncoder.get() <= -1850 && RobotMap.leftDriveEncoder.get() <= -1850){
			RobotMap.robotDrive.arcadeDrive(0,0);
		}
		
		*/}
	public void setDistances(double x, double y, double z){
		RobotMap.backLeft.setEncPosition(0);
		RobotMap.backRight.setEncPosition(0);
		while(/*RobotMap.backRight.getEncPosition() <= z &&*/ RobotMap.backLeft.getEncPosition() >= z){
			RobotMap.robotDrive.arcadeDrive(x,y);
			SmartDashboard.putNumber("encoderCount", RobotMap.backLeft.getEncPosition());
		}
		while(/*RobotMap.backRight.getEncPosition() >= z &&*/ RobotMap.backLeft.getEncPosition() <= z){
			RobotMap.robotDrive.arcadeDrive(0,0);
		}
	}
	
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

