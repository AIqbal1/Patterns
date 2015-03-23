package com.iavaab.state.tests;

import com.iavaab.state.factory.Patient;
import com.iavaab.state.factory.PatientFactory;

public class Test {
    public static void main(String[] args) {
        Patient tomCruise = PatientFactory.createPatient();//Creating the patient
        tomCruise.admit(); //admitting the patient
        tomCruise.changeWard(); //Changing the ward
        try {
            tomCruise.admit(); //trying to admit an admitted patient. Error expected
        } catch (Throwable e) {
            //This operation is not supported hence getting an error
            System.out.println(e.getLocalizedMessage());
        }
        tomCruise.discharge(); //discharging the patient
        try {
            tomCruise.changeWard(); //Trying to change the location for patient who is not             admitted
        } catch (Throwable e) {
            //This operation is not supported hence getting an error
            System.out.println(e.getLocalizedMessage());
        }
        tomCruise.admit(); //trying to readmit
        tomCruise.pronounceDead(); //pronouncing the patient dead
        try {
            tomCruise.admit(); //trying to admit dead patient. Error expected
        } catch (Throwable e) {
            //This operation is not supported hence getting an error 

            System.out.println(e.getLocalizedMessage());
        } 

    }

}
