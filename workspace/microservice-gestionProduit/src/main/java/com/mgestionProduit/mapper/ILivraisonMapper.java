package com.mgestionProduit.mapper;

import com.mgestionProduit.dto.LivraisonDTO;
import com.mgestionProduit.entites.Livraison;

public interface ILivraisonMapper {
	
	LivraisonDTO convertToLivraisonDTO(Livraison livraison);
	
	Livraison convertToLivraison(LivraisonDTO livraisonDTO);

}
