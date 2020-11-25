package com.mgestion_rdv.mapper;

import com.mgestion_rdv.dto.SalonDTO;
import com.mgestion_rdv.entity.Salon;

public interface ISalonMapper {

	SalonDTO convertToSalonDTO(Salon salon);
	
	Salon convertToSalon(SalonDTO salonDTO);
}
