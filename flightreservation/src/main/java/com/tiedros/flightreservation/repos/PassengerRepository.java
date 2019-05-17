package com.tiedros.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiedros.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
