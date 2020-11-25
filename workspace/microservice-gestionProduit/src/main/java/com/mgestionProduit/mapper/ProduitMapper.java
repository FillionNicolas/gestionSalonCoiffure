package com.mgestionProduit.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import com.mgestionProduit.dto.ProduitDTO;
import com.mgestionProduit.entites.Produit;

@Component
public class ProduitMapper implements IProduitMapper {
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public ProduitDTO convertToProduitDTO(Produit produit) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		ProduitDTO produitDTO = modelMapper.map(produit, ProduitDTO.class);
		
		return produitDTO;
	}

	@Override
	public Produit convertToProduit(ProduitDTO produitDTO) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		Produit produit = modelMapper.map(produitDTO, Produit.class);
		
		return produit;
	}

}
