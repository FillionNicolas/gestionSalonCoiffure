package com.mgestion_rdv.service;

import java.util.List;


import com.mgestion_rdv.entity.Prestation;

public interface PrestationService {
	
			public Prestation savePrestation(Prestation prestation);
			
			public List<Prestation> findAllPrestation();
			
			public Prestation findOnePrestation(Long idPrestation);
			
			void deletePrestation(Long idPrestation);
			
}
