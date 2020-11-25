package com.mutilisateur.mapper;

import com.mutilisateur.DTO.UtilisateurDTO;
import com.mutilisateur.entity.Utilisateur;

public interface IUtilisateurMapper {

	UtilisateurDTO convertToUtilisateurDTO(Utilisateur utilisateur);
	
	Utilisateur convertToUtilisateur(UtilisateurDTO utilisateurDTO);
}
