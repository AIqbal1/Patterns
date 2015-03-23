package com.iavaab.state.factory;

import com.iavaab.state.pattern.AdmittedPatientState;
import com.iavaab.state.pattern.DeadPatientState;
import com.iavaab.state.pattern.DischargedPatientState;
import com.iavaab.state.pattern.NewPatientState;
import com.iavaab.state.pattern.NullPatientState;

public interface StateTransition {
    public static final PatientState NEW_PATIENT = new NewPatientState();
    public static final PatientState ADMITTED_PATIENT = new AdmittedPatientState();
    public static final PatientState DISCHARGED_PATIENT = new DischargedPatientState();
    public static final PatientState DEAD_PATIENT = new DeadPatientState();
    public static final PatientState NULL_PATIENT = new NullPatientState();
    void changeStateTo(PatientState patientState);
}
