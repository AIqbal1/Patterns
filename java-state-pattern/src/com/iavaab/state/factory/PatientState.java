package com.iavaab.state.factory;

public interface PatientState {
	
	public void admit(StateTransition stateTransition);

	public void changeWard(StateTransition stateTransition);

	public void discharge(StateTransition stateTransition);

	public void pronounceDead(StateTransition stateTransition);
}
