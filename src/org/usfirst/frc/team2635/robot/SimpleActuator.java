package org.usfirst.frc.team2635.robot;

import edu.wpi.first.wpilibj.SpeedController;

public class SimpleActuator implements IActuator<Double> {

	SpeedController actuator;
	public SimpleActuator(SpeedController actuator) {
		super();
		this.actuator = actuator;
	}
	@OverriSde
	public void actuate(Double magnitude) {
		actuator.set(magnitude);
	}

}
