package com.mgestion_rdv.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.mgestion_rdv.dto.SalonDTO;
import com.mgestion_rdv.entity.Salon;

@Component
public class SalonMapper implements ISalonMapper{

	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public SalonDTO convertToSalonDTO(Salon salon) {
		
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		SalonDTO salonDTO = modelMapper.map(salon, SalonDTO.class);
		
		return salonDTO;
	}

	@Override
	public Salon convertToSalon(SalonDTO salonDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Salon salon = modelMapper.map(salonDTO, Salon.class);
		
		return salon;
	}

}
