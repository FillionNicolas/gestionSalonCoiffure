package com.mreclamation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mreclamation.entities.Reclamation;
import com.mreclamation.repositories.ReclamationRepository;
import com.mreclamation.service.IReclamationService;

@Service
public class ReclamationServiceImpl implements IReclamationService{
	
	@Autowired
	ReclamationRepository reclamationRepository;

	@Override
	public Reclamation saveReclamation(Reclamation reclamation) {
		return reclamationRepository.save(reclamation);
	}

	@Override
	public List<Reclamation> findAllReclamation() {
		return reclamationRepository.findAll();
	}

	@Override
	public Reclamation findOneReclamation(Long idReclamation) {
		return reclamationRepository.findById(idReclamation).get();
	}

	@Override
	public void deleteReclamation(Long idReclamation) {
		reclamationRepository.deleteById(idReclamation);
	}


}
