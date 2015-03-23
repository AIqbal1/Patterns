package com.iavaab.state.pattern;

import com.iavaab.state.factory.PatientState;
import com.iavaab.state.factory.StateTransition;

public class NullPatientState implements PatientState {

	public void admit(StateTransition stateTransition) {
		throw new UnsupportedOperationException(
				"This operation is not supported at this             state");
	}

	public void changeWard(StateTransition stateTransition) {
		throw new UnsupportedOperationException(
				"This operation is not supported at this             state");
	}

	public void discharge(StateTransition stateTransition) {
		throw new UnsupportedOperationException(
				"This operation is not supported at this             state");
	}

	public void pronounceDead(StateTransition stateTransition) {
		throw new UnsupportedOperationException(
				"This operation is not supported at this             state");
	}
}
