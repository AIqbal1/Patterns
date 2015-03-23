package com.iavaab.state.pattern;

import com.iavaab.state.factory.StateTransition;

public class DischargedPatientState extends NullPatientState {
	
    @Override
    public void admit(StateTransition stateTransition) {
        System.out.println("This patient had been alread admitted in this hospital before !");
        stateTransition.changeStateTo(StateTransition.ADMITTED_PATIENT);
    }
	
}
