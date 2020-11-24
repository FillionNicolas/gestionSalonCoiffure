package com.mgestion_rdv.service;

import java.util.List;
import java.util.Optional;

import com.mgestion_rdv.entity.Salon;


public interface ISalonService {
	List<Salon> findAll();
	Optional<Salon> findOne(Long id);
	Salon saveSalon(Salon salon);
	void deleteSalon(Salon salon);
}
