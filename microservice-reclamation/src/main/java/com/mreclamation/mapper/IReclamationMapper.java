package com.mreclamation.mapper;

import com.mreclamation.DTO.ReclamationDTO;
import com.mreclamation.entities.Reclamation;

public interface IReclamationMapper {

	ReclamationDTO convertToReclamationDTO(Reclamation reclamation);
	
	Reclamation convertToReclamation(ReclamationDTO reclamationDTO);
}
