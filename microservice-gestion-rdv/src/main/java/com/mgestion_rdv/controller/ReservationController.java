package com.mgestion_rdv.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgestion_rdv.dto.ReservationDTO;
import com.mgestion_rdv.entity.Reservation;
import com.mgestion_rdv.mapper.IReservationMapper;
import com.mgestion_rdv.service.ReservationService;

@CrossOrigin
@RestController
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	
	@Autowired
	IReservationMapper reservationMapper;
	
	
	@GetMapping("/reservations")
	public List<ReservationDTO> findAll(){
		return (List<ReservationDTO>) reservationService.findAllReservation().stream().map(e->reservationMapper.convertToReservationDTO(e))
				.collect(Collectors.toList());
	}
	
	@GetMapping("/reservations/{id}")
	public ReservationDTO findOne(@PathVariable("id") Long idReservation) {
		return reservationMapper.convertToReservationDTO(reservationService.findOneReservation(idReservation));
		
	}
	
	@PostMapping("/reservations")
	public ReservationDTO  saveOrUpdate(@RequestBody Reservation reservation) {
		return reservationMapper.convertToReservationDTO(reservationService.saveReservation(reservation));
	}
	
	@DeleteMapping("/reservations/{id}")
	public void deleteOneByID(@PathVariable("id") Long idReservation) {
		reservationService.deleteReservation(idReservation);
	}
	
	@PutMapping("/reservations/{id}")
	public ReservationDTO updateReservation(@RequestBody Reservation reservation, @PathVariable("id") Long idReservation) {
		Reservation currentReservation = reservationService.findOneReservation(idReservation);
		currentReservation.setIdReservation(reservation.getIdReservation());
		currentReservation.setDateReservation(reservation.getDateReservation());
		return reservationMapper.convertToReservationDTO(reservationService.saveReservation(currentReservation));
	}
			
		
}
