
package org.usfirst.frc.team2635.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	final int GRABBER_MOTOR_CHANNEL = 1;
	
	final int REAR_RIGHT_CHANNEL = 2;
	final int REAR_LEFT_CHANNEL = 3;
	final int FRONT_RIGHT_CHANNEL = 4;
	final int FRONT_LEFT_CHANNEL = 5;
	
	final int JOYSTICK_CHANNEL = 1;
	final int MOVE_AXIS = 1;
	final int ROTATE_AXIS = 2;
	final int GRAB_UP_BUTTON = 1;
	final int GRAB_DOWN_BUTTON = 2;
	
	final double GRAB_UP_MAGNITUDE = 1.0;
	final double GRAB_DOWN_MAGNITUDE = -1.0;
	CANTalon grabberMotor;
	CANTalon rearRightMotor;
	CANTalon rearLeftMotor;
	CANTalon frontRightMotor;
	CANTalon frontLeftMotor;
    RobotDrive drive;
	IDrive driveMethod;
    
	Grabber grabber;
    
    Joystick joystick;
    
	/**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
    	joystick = new Joystick(JOYSTICK_CHANNEL);
    	
    	rearRightMotor = new CANTalon(REAR_RIGHT_CHANNEL);
    	rearLeftMotor = new CANTalon(REAR_LEFT_CHANNEL);
    	frontRightMotor = new CANTalon(FRONT_RIGHT_CHANNEL);
    	frontLeftMotor = new CANTalon(FRONT_LEFT_CHANNEL);
    	
    	drive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
    	
    	driveMethod = new ArcadeDrive(drive);
    	
    	grabberMotor = new CANTalon(GRABBER_MOTOR_CHANNEL);
    	grabber = new Grabber(new SimpleActuator(grabberMotor));
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	double Y = joystick.getRawAxis(MOVE_AXIS);
    	double X = joystick.getRawAxis(ROTATE_AXIS);
    	boolean grabUp = joystick.getRawButton(GRAB_UP_BUTTON);
    	boolean grabDown = joystick.getRawButton(GRAB_DOWN_BUTTON);
    	
    	driveMethod.drive(X, Y);
    	
    	if(grabUp){
    		grabber.grab(GRAB_UP_MAGNITUDE);
    	}
    	else if(grabDown){
    		grabber.grab(GRAB_DOWN_MAGNITUDE);
    	}
    	else
    	{
    		grabber.grab(0.0);
    	}
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
