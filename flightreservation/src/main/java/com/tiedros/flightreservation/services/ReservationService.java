package com.tiedros.flightreservation.services;

import com.tiedros.flightreservation.dto.ReservationRequest;
import com.tiedros.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
