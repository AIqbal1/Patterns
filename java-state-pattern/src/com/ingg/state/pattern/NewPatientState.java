package com.ingg.state.pattern;

import com.ingg.state.factory.StateTransition;

public class NewPatientState extends NullPatientState {
    @Override
    public void admit(StateTransition stateTransition) {
        System.out.println("The patient is admitted to hospital");
        stateTransition.changeStateTo(StateTransition.ADMITTED_PATIENT);
    }
}
