package com.java.design.pattern.command;

import com.java.design.pattern.receiver.ElectronicDevice;

// this is the command that calls relevant method on the receiver

public class TurnTvOn {

	ElectronicDevice theDevice;
	
	public TurnTvOn(ElectronicDevice newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.on();
		
	}

	public void undo() {
		
		theDevice.off();
		
	}	
	
}
