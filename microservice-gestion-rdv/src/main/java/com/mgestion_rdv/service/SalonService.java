package com.mgestion_rdv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgestion_rdv.entity.Salon;
import com.mgestion_rdv.repository.SalonRepository;

@Service
public class SalonService implements ISalonService {
	@Autowired
	SalonRepository salonRepository;

	@Override
	public List<Salon> findAll() {
		return salonRepository.findAll();
	}

	@Override
	public Optional<Salon> findOne(Long id) {
		return salonRepository.findById(id);
	}

	@Override
	public Salon saveSalon(Salon salon) {
		return salonRepository.save(salon);
	}

	@Override
	public void deleteSalon(Salon salon) {
		salonRepository.delete(salon);
	}
}
