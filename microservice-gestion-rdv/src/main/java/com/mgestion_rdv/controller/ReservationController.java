package com.mgestion_rdv.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgestion_rdv.configurations.ApplicationPropertiesConfiguration;
import com.mgestion_rdv.entity.Reservation;
import com.mgestion_rdv.service.IReservationService;

@CrossOrigin
@RestController
public class ReservationController {
	@Autowired
	IReservationService reservationService;
	
	@Autowired
	ApplicationPropertiesConfiguration applicationPropertiesConfiguration;
	
	@GetMapping("/reservations")
	public List< Reservation> findAll() {
		List<Reservation > reservations=reservationService.findAll();
		//List< Reservation> listeLimitee=reservations.subList(0, ApplicationPropertiesConfiguration.getLimitDeReservations());	
		List<Reservation> listeLimitee=reservations.subList(0, applicationPropertiesConfiguration.getLimitDeReservations());
		return listeLimitee;
	}

	
	@GetMapping("/reservations/{idReservation}")
	public Optional<Reservation> findOne(@PathParam("idReservation")Long id) {
		return reservationService.findOne(id);
	}
	
	@PostMapping("/reservations")
	public Reservation saveReservation(@RequestBody Reservation reservation) {
		return reservationService.saveReservation(reservation);
	}
	
	@DeleteMapping("/reservations/{idReservation}")
	public void deleteReservation(Reservation reservation) {
		reservationService.deleteReservation(reservation);
		
	}
		
}
