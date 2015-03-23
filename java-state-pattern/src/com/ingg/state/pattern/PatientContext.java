package com.ingg.state.pattern;

import com.ingg.state.factory.Patient;
import com.ingg.state.factory.PatientState;
import com.ingg.state.factory.StateTransition;

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
