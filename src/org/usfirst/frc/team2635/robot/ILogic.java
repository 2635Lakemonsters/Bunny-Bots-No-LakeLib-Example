package org.usfirst.frc.team2635.robot;

/**
 * Interface for things that perform logic operations on other things
 * @author localuser
 *
 * @param <ModifierType>
 */
public interface ILogic<InputType, ModifierType> {
	public InputType operate(InputType input, ModifierType modifier);
}
