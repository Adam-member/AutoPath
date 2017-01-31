package org.usfirst.frc.team2557.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANTalon frontLeft;
	public static CANTalon frontRight;
	public static CANTalon backLeft;
	public static CANTalon backRight;
	public static CANTalon intakeMotor;
	public static CANTalon winchMotor;
	public static RobotDrive robotDrive;
	public static Counter encoder;
	
	public static DoubleSolenoid intakeArm;
	public static DoubleSolenoid winchSolenoid;
	public static DoubleSolenoid driveShift;
	
	public static DigitalInput hallEffect;
	public static DigitalInput lightSensor;
	public static Encoder leftDriveEncoder;
	public static Encoder rightDriveEncoder;
	public static Encoder winchEncoder;
	
	public static int winchEncoderCount;
	public static double rightEncoderRate;
	public static double leftEncoderRate;
	
	public static Timer time;
	public static double timerValue;
	public static double oldTime;
	public static double oldThrottle;
	
	public static boolean hallValue;
	public static boolean lightValue;
	
	public static double jx;
	public static double jy;
	public static double x;
	public static double y;
	public static double c;
	
	public static double frontLeftVoltage;
	public static double frontRightVoltage;
	public static double rearLeftVoltage;
	public static double rearRightVoltage;
	public static double lowSpeed;
	
	public static double briefSave;
	
	
	public static double backLeftEnc;
	
	
	public static void init(){
		frontLeft = new CANTalon(7);
		frontRight = new CANTalon(8);
		backLeft = new CANTalon(6);
		backRight = new CANTalon(5);
		
		intakeMotor = new CANTalon(3);
		winchMotor = new CANTalon(2);
		
	    frontLeft.setInverted(true);
        frontRight.setInverted(false);
        backLeft.setInverted(true);
        backRight.setInverted(false);
        
        robotDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
        
        intakeArm = new DoubleSolenoid (0,2,3);
        winchSolenoid = new DoubleSolenoid(0,0,1);
        driveShift = new DoubleSolenoid(0,4,5);
        
        hallEffect = new DigitalInput(0);
        lightSensor = new DigitalInput(1);
        leftDriveEncoder = new Encoder(2,3);
        rightDriveEncoder = new Encoder(4,5);
        winchEncoder = new Encoder(6,7);
        
        
	}
	
		
	}
	
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

