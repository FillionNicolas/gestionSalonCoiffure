package com.mgestion_rdv.mapper;

import com.mgestion_rdv.dto.PrestationDTO;
import com.mgestion_rdv.entity.Prestation;

public interface IPrestationMapper {
	
	PrestationDTO convertToPrestationDTO(Prestation prestation);
	
	Prestation convertToPrestation(PrestationDTO prestationDTO);
}
