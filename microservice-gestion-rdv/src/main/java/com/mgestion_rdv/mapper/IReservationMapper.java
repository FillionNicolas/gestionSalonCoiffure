package com.mgestion_rdv.mapper;

import com.mgestion_rdv.dto.ReservationDTO;
import com.mgestion_rdv.entity.Reservation;

public interface IReservationMapper {
	ReservationDTO convertToReservationDTO(Reservation reservation);

	Reservation convertToReservation(ReservationDTO reservationDTO);
}
