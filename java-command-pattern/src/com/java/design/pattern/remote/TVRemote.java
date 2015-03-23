package com.java.design.pattern.remote;

import com.java.design.pattern.receiver.ElectronicDevice;
import com.java.design.pattern.receiver.Television;

public class TVRemote {
	
	public static ElectronicDevice getDevice(){
		
		return new Television();
		
	}
	
}
