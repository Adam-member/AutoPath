package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeArm extends Subsystem {
	
	boolean ASDFGHJKL = true;
	
	public static void IntakeArmFoward(){
		if(Robot.oi.button1.get()){
			RobotMap.intakeArm.set(Value.kForward);
		}
	
	}
    
	public void IntakeBackward(){
		if(Robot.oi.button2.get()){
		
			RobotMap.intakeArm.set(Value.kReverse);
		}
		
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void arm(){
//    	if(RobotMap.intakeArm.get() == Value.kReverse){
//    		RobotMap.intakeArm.set(Value.kForward);
//    	}
//    	else{
//    		RobotMap.intakeArm.set(Value.kReverse);
//    	}
    	}
    }