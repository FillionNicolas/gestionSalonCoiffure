package com.mgestion_rdv.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgestion_rdv.entity.Reservation;
import com.mgestion_rdv.repository.ReservationRepository;
import com.mgestion_rdv.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	 ReservationRepository  reservationRepository;
	
	@Override
	public  Reservation saveReservation( Reservation reservation) {	
		return reservationRepository.save(reservation);
	}
	
	@Override
	public List<Reservation> findAllReservation() {	
		return reservationRepository.findAll();
	}
	
	@Override
	public  Reservation findOneReservation(Long idReservation) {
		return reservationRepository.findById(idReservation).get();
	}

	@Override
	public void deleteReservation(Long idReservation) {
		reservationRepository.deleteById(idReservation);
	}
}
