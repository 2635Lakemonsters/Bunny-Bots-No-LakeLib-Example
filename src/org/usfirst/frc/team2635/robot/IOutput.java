package org.usfirst.frc.team2635.robot;

public interface IOutput<OutputType, ModifierType> {
	
	public OutputType getOutput(ModifierType modifier);

}
