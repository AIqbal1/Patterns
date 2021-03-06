package com.java.design.pattern.command;

import com.java.design.pattern.receiver.ElectronicDevice;

public class TurnTvOff implements Command {
	
	ElectronicDevice theDevice;
	
	public TurnTvOff(ElectronicDevice newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.off();
		
	}

	// Used if you want to allow for undo
	// Do the opposite of execute()
	
	public void undo() {
		
		theDevice.on();
		
	}
}
