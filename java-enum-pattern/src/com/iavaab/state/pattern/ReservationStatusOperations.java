package com.iavaab.state.pattern;

import com.iavaab.states.Reservation;
import com.iavaab.states.ReservationStatus;

public interface ReservationStatusOperations {
	ReservationStatus accept(Reservation reservation);

	ReservationStatus charge(Reservation reservation);

	ReservationStatus cancel(Reservation reservation);
}
