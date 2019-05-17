package com.tiedros.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiedros.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
