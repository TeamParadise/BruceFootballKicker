package net.pvschools.robotics.javabot.practice.commands;

import net.pvschools.robotics.javabot.practice.commands.piston.OpenLatch;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class ActuallyKickFootball extends CommandGroup {

	public  ActuallyKickFootball()
	{
		addSequential(new ChargeKicker());
		addSequential(new WaitCommand(2.0));
		addSequential(new OpenLatch());
	}
}
