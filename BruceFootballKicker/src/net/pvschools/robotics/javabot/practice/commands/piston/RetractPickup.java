/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to retract the pickup pistons.
 * 
 * @author jkoehring
 */
public class RetractPickup extends PistonCommand
{
	public RetractPickup()
	{
		super(pickupPistons, extend);
	}
}
