package org.usfirst.frc.team2635.robot;

public class ArrayScaler implements ILogic<Double[], Double>{

	@Override
	public Double[] operate(Double[] input, Double modifier) {
		return input * modifier;
	}
	
}
