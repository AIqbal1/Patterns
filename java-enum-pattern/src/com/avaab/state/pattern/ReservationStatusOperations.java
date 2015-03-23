package com.avaab.state.pattern;

import com.avaab.states.Reservation;
import com.avaab.states.ReservationStatus;

public interface ReservationStatusOperations {
	ReservationStatus accept(Reservation reservation);

	ReservationStatus charge(Reservation reservation);

	ReservationStatus cancel(Reservation reservation);
}
