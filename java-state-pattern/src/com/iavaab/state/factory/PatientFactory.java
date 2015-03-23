package com.iavaab.state.factory;

import com.iavaab.state.pattern.PatientContext;

public abstract class PatientFactory {

	public static Patient createPatient() {
		return new PatientContext();
	}
	
}
