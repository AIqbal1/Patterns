package com.iavaab.state.pattern;

import com.iavaab.state.factory.Patient;
import com.iavaab.state.factory.PatientState;
import com.iavaab.state.factory.StateTransition;

public class PatientContext implements Patient, StateTransition {
	
	private PatientState patientState;

	public PatientContext() {
		changeStateTo(StateTransition.NEW_PATIENT);
	}

	public void admit() {
		patientState.admit(this);
	}

	public void changeWard() {
		patientState.changeWard(this);
	}

	public void discharge() {
		patientState.discharge(this);
	}

	public void pronounceDead() {
		patientState.pronounceDead(this);
	}

	public void changeStateTo(PatientState patientState) {
		this.patientState = patientState;
	}
}
