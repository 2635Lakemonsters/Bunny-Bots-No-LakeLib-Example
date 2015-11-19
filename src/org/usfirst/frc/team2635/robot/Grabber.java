package org.usfirst.frc.team2635.robot;

public class Grabber {
	
	//Plug for the thing that grabs
	public IActuator<Double> grabber;
	public Grabber(IActuator<Double> grabber){
		this.grabber = grabber;
	}
	public void grab(double magnitude){
		grabber.actuate(magnitude);
	}
	
}
