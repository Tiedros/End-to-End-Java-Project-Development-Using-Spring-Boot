package com.tiedros.flightreservation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tiedros.flightreservation.entities.Reservation;
import com.tiedros.flightreservation.repos.FlightRepository;
import com.tiedros.flightreservation.repos.PassengerRepository;
import com.tiedros.flightreservation.repos.ReservationRepository;
import com.tiedros.flightreservation.util.EmailUtil;
import com.tiedros.flightreservation.util.PDFGenerator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightreservationApplicationTests {

	@Autowired
	PassengerRepository repo;

	@Autowired
	FlightRepository flightRepo;

	@Autowired
	ReservationRepository reservationRepo;

	@Autowired
	PDFGenerator pdfGenerator;

	@Autowired
	EmailUtil emailUtil;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGenerateItenarary() {
		Reservation reservation = reservationRepo.findById(1L).get();
		String filePath = "/Users/bharaththippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		pdfGenerator.generateItinerary(reservation, filePath);
	}

	@Test
	public void testEmail() {
		Reservation reservation = reservationRepo.findById(1L).get();
		String filePath = "/Users/bharaththippireddy/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		emailUtil.sendItinerary("thippireddy.bharath@gmail.com", filePath);
	}

}
