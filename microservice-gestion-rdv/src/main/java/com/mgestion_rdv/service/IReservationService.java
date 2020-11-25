package com.mgestion_rdv.service;

import java.util.List;
import java.util.Optional;

import com.mgestion_rdv.entity.Reservation;

public interface IReservationService {
	List<Reservation> findAll();
	Optional<Reservation> findOne(Long id);
	Reservation saveReservation(Reservation reservation);
	void deleteReservation(Reservation reservation);
}
