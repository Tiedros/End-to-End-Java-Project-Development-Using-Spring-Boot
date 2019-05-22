package com.tiedros.flightcheckin.integration;

import com.tiedros.flightcheckin.integration.dto.Reservation;
import com.tiedros.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}
