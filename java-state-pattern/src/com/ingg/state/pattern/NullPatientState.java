package com.ingg.state.pattern;

import com.ingg.state.factory.PatientState;
import com.ingg.state.factory.StateTransition;

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
