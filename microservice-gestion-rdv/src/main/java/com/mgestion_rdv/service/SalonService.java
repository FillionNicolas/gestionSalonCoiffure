package com.mgestion_rdv.service;

import java.util.List;


import com.mgestion_rdv.entity.Salon;

public interface SalonService {
			
			
			public Salon saveSalon(Salon salon);
			
			public List<Salon> findAllSalon();
			
			public Salon findOneSalon(Long idSalon);
			
			void deleteSalon(Long idSalon);
}
