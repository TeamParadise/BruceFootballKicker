package net.pvschools.robotics.javabot.practice.commands;

import net.pvschools.robotics.javabot.practice.commands.piston.CloseLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenLatch;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class FootballKicker extends CommandGroup {
    
    public  FootballKicker() {
      addSequential(new OpenLatch());
      addSequential(new WaitCommand(0.2));
      addSequential(new ResetKicker());
      addSequential(new WaitCommand(2.0));
      addSequential(new CloseLatch());      
    }
}
