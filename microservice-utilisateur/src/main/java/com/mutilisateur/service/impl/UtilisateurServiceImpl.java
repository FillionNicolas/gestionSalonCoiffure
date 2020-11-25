package com.mutilisateur.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mutilisateur.entity.Utilisateur;
import com.mutilisateur.repository.UtilisateurRepository;
import com.mutilisateur.service.IUtilisateurService;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService{

	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@Override
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public List<Utilisateur> findUtilisateurs() {
		return utilisateurRepository.findAll();
	}

	//pas d'optional chez Louise (source IUtilisateurService.java, next UtilisateurController.java)
//	@Override
//	public Optional<Utilisateur> findUtilisateurById(Long id) {
//		return utilisateurRepository.findById(id);
//	}

	@Override
	public Utilisateur findUtilisateur(Long id) {
//		return utilisateurRepository.getOne(id);
		return utilisateurRepository.findById(id).get();//pour s'alligner au code de Louise
	}

	@Override
	public void deleteUtilisateurById(Long id) {
		utilisateurRepository.deleteById(id);
		
	}
}
