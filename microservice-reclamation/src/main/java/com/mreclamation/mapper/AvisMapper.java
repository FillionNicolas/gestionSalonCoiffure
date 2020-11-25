package com.mreclamation.mapper;

import com.mreclamation.DTO.AvisDTO;
import com.mreclamation.entities.Avis;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
public class AvisMapper implements IAvisMapper{

	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public AvisDTO convertToAvisDTO(Avis avis) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		AvisDTO avisDTO = modelMapper.map(avis, AvisDTO.class);
		return avisDTO;
	}

	@Override
	public Avis convertToAvis(AvisDTO avisDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Avis avis = modelMapper.map(avisDTO, Avis.class);
		return avis;
	}

}
