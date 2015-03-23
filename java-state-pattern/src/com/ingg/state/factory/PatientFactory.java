package com.ingg.state.factory;

import com.ingg.state.pattern.PatientContext;

public abstract class PatientFactory {

	public static Patient createPatient() {
		return new PatientContext();
	}
	
}
