package com.mreclamation.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.mreclamation.DTO.ReclamationDTO;
import com.mreclamation.entities.Reclamation;

@Component
public class ReclamationMapper implements IReclamationMapper{

	ModelMapper modelMapper = new ModelMapper();

	
	@Override
	public ReclamationDTO convertToReclamationDTO(Reclamation reclamation) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		ReclamationDTO reclamationDTO = modelMapper.map(reclamation, ReclamationDTO.class);
		return reclamationDTO;
	}

	@Override
	public Reclamation convertToReclamation(ReclamationDTO reclamationDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Reclamation reclamation = modelMapper.map(reclamationDTO, Reclamation.class);
		return reclamation;
	}

}
