package com.mgestion_rdv.service;

import java.util.List;
import java.util.Optional;

import com.mgestion_rdv.entity.Prestation;


public interface IPrestationService {
	List<Prestation> findAll();
	Optional<Prestation> findOne(Long id);
	Prestation savePrestation(Prestation prestation);
	void deletePrestation(Prestation prestation);
}
