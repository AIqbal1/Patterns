package com.java.design.pattern.command;

import com.java.design.pattern.receiver.ElectronicDevice;

public class TurnTvUp implements Command {

	ElectronicDevice theDevice;
	
	public TurnTvUp(ElectronicDevice newDevice){
		
		theDevice = newDevice;
		
	}
	
	public void execute() {
		
		theDevice.volumeUp();
		
	}

	public void undo() {
		
		theDevice.volumenDown();
		
	}

}
