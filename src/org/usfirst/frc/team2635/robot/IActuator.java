package org.usfirst.frc.team2635.robot;

public interface IActuator<MagnitudeType> {
	public void actuate(MagnitudeType magnitude);
}