package com.ingg.state.factory;

import com.ingg.state.pattern.AdmittedPatientState;
import com.ingg.state.pattern.DeadPatientState;
import com.ingg.state.pattern.DischargedPatientState;
import com.ingg.state.pattern.NewPatientState;
import com.ingg.state.pattern.NullPatientState;

public interface StateTransition {
    public static final PatientState NEW_PATIENT = new NewPatientState();
    public static final PatientState ADMITTED_PATIENT = new AdmittedPatientState();
    public static final PatientState DISCHARGED_PATIENT = new DischargedPatientState();
    public static final PatientState DEAD_PATIENT = new DeadPatientState();
    public static final PatientState NULL_PATIENT = new NullPatientState();
    void changeStateTo(PatientState patientState);
}
