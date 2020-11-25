package com.mgestion_rdv.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.mgestion_rdv.dto.ReservationDTO;
import com.mgestion_rdv.entity.Reservation;

@Component
public class ReservationMapper implements IReservationMapper{
	 ModelMapper modelMapper=new ModelMapper();
	 
	 @Override 
	 public ReservationDTO convertToReservationDTO(Reservation reservation) {
		 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		 ReservationDTO reservationDTO=modelMapper.map(reservation, ReservationDTO.class);
		 return reservationDTO;
	 }
	 
	 @Override 
	 public Reservation convertToReservation(ReservationDTO reservationDTO) {
		 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		 Reservation reservation =modelMapper.map(reservationDTO, Reservation.class);
		 return reservation;
	 }
	 
}
