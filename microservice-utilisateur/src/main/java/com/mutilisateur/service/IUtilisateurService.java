package com.mutilisateur.service;

import java.util.List;
import java.util.Optional;

import com.mutilisateur.entity.Utilisateur;

public interface IUtilisateurService {
	
	public Utilisateur saveUtilisateur(Utilisateur utilisateur);//Louise typo: saveUtilisateur
	public List<Utilisateur> findUtilisateurs();//Louise Typo: getUtilisateurs
//	public Optional<Utilisateur> findUtilisateurById(Long id);//Louise Typo: pas utilisation optional (next:UtilisateurServiceImpl.java)
	public Utilisateur findUtilisateur(Long id);//Louise Typo: getUtilisateur /*utilise dans le put du controller*/
	public void deleteUtilisateurById(Long id);//Louise Typo: deleteUtilisateur
	
}
