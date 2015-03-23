package com.iavaab.state.pattern;

import com.iavaab.state.factory.StateTransition;

public class AdmittedPatientState extends NullPatientState {

    @Override
    public void changeWard(StateTransition stateTransition) {
        System.out.println("The patient ward is changed !!!, Nothing special");
        stateTransition.changeStateTo(StateTransition.ADMITTED_PATIENT);
    }

    @Override
    public void discharge(StateTransition stateTransition) {
        System.out.println("The patient is discharged !!!, Nothing special");
        stateTransition.changeStateTo(StateTransition.DISCHARGED_PATIENT);
    }

    @Override
    public void pronounceDead(StateTransition stateTransition) {
        System.out.println("The patient is pronounced dead as he deserved !!!");
        stateTransition.changeStateTo(StateTransition.DEAD_PATIENT);
    }
}
