package com.mgestion_rdv.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgestion_rdv.entity.Prestation;
import com.mgestion_rdv.repository.PrestationRepository;
import com.mgestion_rdv.service.PrestationService;

@Service
public class PrestationServiceImpl implements PrestationService{
	@Autowired
	PrestationRepository prestationRepository;
	
	@Override
	public  Prestation savePrestation( Prestation prestation) {	
		return prestationRepository.save(prestation);
	}
	
	@Override
	public List<Prestation> findAllPrestation() {	
		return prestationRepository.findAll();
	}
	
	@Override
	public  Prestation findOnePrestation(Long idPrestation) {
		return prestationRepository.findById(idPrestation).get();
	}

	@Override
	public void deletePrestation(Long idPrestation) {
		prestationRepository.deleteById(idPrestation);
	}
}
