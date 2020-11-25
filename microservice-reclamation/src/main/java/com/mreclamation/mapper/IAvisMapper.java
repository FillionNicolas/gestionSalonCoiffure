package com.mreclamation.mapper;

import com.mreclamation.DTO.AvisDTO;
import com.mreclamation.entities.Avis;

public interface IAvisMapper {
	
	AvisDTO convertToAvisDTO(Avis avis);
	
	Avis convertToAvis(AvisDTO avisDTO);

}
