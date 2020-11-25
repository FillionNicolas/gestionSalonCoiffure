package com.mutilisateur.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.mutilisateur.DTO.UtilisateurDTO;
import com.mutilisateur.entity.Utilisateur;

@Component
public class UtilisateurMapper implements IUtilisateurMapper{

	ModelMapper modelMapper = new ModelMapper();

	@Override
	public UtilisateurDTO convertToUtilisateurDTO(Utilisateur utilisateur) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		UtilisateurDTO utilisateurDTO = modelMapper.map(utilisateur, UtilisateurDTO.class);
		return utilisateurDTO;	
	}

	@Override
	public Utilisateur convertToUtilisateur(UtilisateurDTO utilisateurDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Utilisateur utilisateur = modelMapper.map(utilisateurDTO, Utilisateur.class);
		return utilisateur;
	}

}
