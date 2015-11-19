package org.usfirst.frc.team2635.robot;

import edu.wpi.first.wpilibj.RobotDrive;

public class ArcadeDrive implements IDrive{

	RobotDrive drive;
	
	public ArcadeDrive(RobotDrive drive) {
		super();
		this.drive = drive;
	}

	@Override
	public void drive(double X, double Y) {
		drive.arcadeDrive(Y, X);
	}

}
