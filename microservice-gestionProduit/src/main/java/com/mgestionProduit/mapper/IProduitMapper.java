package com.mgestionProduit.mapper;

import com.mgestionProduit.dto.ProduitDTO;
import com.mgestionProduit.entites.Produit;

public interface IProduitMapper {
	
	ProduitDTO convertToProduitDTO(Produit produit);
	
	Produit convertToProduit(ProduitDTO produitDTO);
	

}
