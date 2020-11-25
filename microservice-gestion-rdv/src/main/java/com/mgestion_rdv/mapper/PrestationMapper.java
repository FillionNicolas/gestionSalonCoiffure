package com.mgestion_rdv.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.mgestion_rdv.dto.PrestationDTO;
import com.mgestion_rdv.entity.Prestation;

@Component
public class PrestationMapper implements IPrestationMapper{
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public PrestationDTO convertToPrestationDTO(Prestation prestation) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		PrestationDTO prestationDTO = modelMapper.map(prestation, PrestationDTO.class);
		return prestationDTO;
	}
	
	@Override
	public Prestation convertToPrestation(PrestationDTO prestationDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Prestation prestation = modelMapper.map(prestationDTO, Prestation.class);
		
		return prestation;
	}
}
