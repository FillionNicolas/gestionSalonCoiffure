package com.mgestion_rdv.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgestion_rdv.entity.Salon;
import com.mgestion_rdv.repository.SalonRepository;
import com.mgestion_rdv.service.SalonService;

@Service
public class SalonServiceImpl implements SalonService {
	@Autowired
	SalonRepository salonRepository;
	
	@Override
	public  Salon saveSalon( Salon salon) {	
		return salonRepository.save(salon);
	}
	
	@Override
	public List<Salon> findAllSalon() {	
		return salonRepository.findAll();
	}
	
	@Override
	public  Salon findOneSalon(Long idSalon) {
		return salonRepository.findById(idSalon).get();
	}

	@Override
	public void deleteSalon(Long idSalon) {
		salonRepository.deleteById(idSalon);
	}
}

