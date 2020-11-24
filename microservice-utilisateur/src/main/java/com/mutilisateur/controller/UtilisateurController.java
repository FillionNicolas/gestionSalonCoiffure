package com.mutilisateur.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mutilisateur.entity.Utilisateur;
import com.mutilisateur.service.IUtilisateurService;

@CrossOrigin
@RestController
public class UtilisateurController {

	@Autowired
	IUtilisateurService utilisateurService;
	
	@PostMapping("/utilisateurs")
	public Utilisateur save(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.saveUtilisateur(utilisateur);
	}
	
	@GetMapping("/utilisateurs")
	public List<Utilisateur> findUtilisateurs(){
		return utilisateurService.findUtilisateurs();
	}

	//pris exemple sur Louise pas d'optional (previous: UtilisateurServiceImpl.java)
//	@GetMapping("/utilisateur/{id}")
//	public Optional<Utilisateur> findUtilisateurById(@PathVariable("id") Long id){
//		return utilisateurService.findUtilisateurById(id);
//	}


	@DeleteMapping("/utilisateurs/{id}")
	public void deleteUtilisateurById(@PathVariable("id") Long id) {
		utilisateurService.deleteUtilisateurById(id);
	}

	@PutMapping("/utilisateurs/{id}")
	public Utilisateur updateUtilisateur(@PathVariable("id") Long id, @RequestBody Utilisateur utilisateur) {
		Utilisateur currentUtilisateur = utilisateurService.findUtilisateur(id);
		currentUtilisateur.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUtilisateur.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		currentUtilisateur.setLoginUtilisateur(utilisateur.getLoginUtilisateur());
		currentUtilisateur.setPasswordUtilisateur(utilisateur.getPasswordUtilisateur());
		currentUtilisateur.setDateNaissanceUtilisateur(utilisateur.getDateNaissanceUtilisateur());
		currentUtilisateur.setNumeroTelephoneUtilisateur(utilisateur.getNumeroTelephoneUtilisateur());
		currentUtilisateur.setVilleUtilisateur(utilisateur.getVilleUtilisateur());
		currentUtilisateur.setAdresseUtilisateur(utilisateur.getAdresseUtilisateur());
		currentUtilisateur.setRoleUtilisateur(utilisateur.getRoleUtilisateur());
		return utilisateurService.saveUtilisateur(currentUtilisateur);
	}
	
}
