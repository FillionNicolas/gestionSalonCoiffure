package com.mgestion_rdv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgestion_rdv.entity.Prestation;
import com.mgestion_rdv.repository.PrestationRepository;

@Service
public class PrestationService implements IPrestationService{
	@Autowired
	PrestationRepository prestationRepository;

	@Override
	public List<Prestation> findAll() {
		return prestationRepository.findAll();
	}

	@Override
	public Optional<Prestation> findOne(Long id) {
		return prestationRepository.findById(id);
	}

	@Override
	public Prestation savePrestation(Prestation prestation) {
		return prestationRepository.save(prestation);
	}

	@Override
	public void deletePrestation(Prestation prestation) {
		prestationRepository.delete(prestation);
	}

}
