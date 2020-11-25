package com.mgestion_rdv.service;

import java.util.List;


import com.mgestion_rdv.entity.Reservation;

public interface ReservationService {
	
			public Reservation saveReservation(Reservation reservation);
			
			public List<Reservation> findAllReservation();
			
			public Reservation findOneReservation(Long idReservation);
			
			void deleteReservation(Long idReservation);
			
	
	
}
