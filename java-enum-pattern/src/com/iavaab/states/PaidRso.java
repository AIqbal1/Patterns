package com.iavaab.states;

import com.iavaab.state.pattern.ReservationStatusOperations;

public class PaidRso implements ReservationStatusOperations {

	@Override
	public ReservationStatus accept(Reservation reservation) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ReservationStatus charge(Reservation reservation) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ReservationStatus cancel(Reservation reservation) {
		throw new UnsupportedOperationException();
	}
}
