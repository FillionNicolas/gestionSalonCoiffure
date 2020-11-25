package com.mgestionProduit.mapper;

import com.mgestionProduit.dto.CommandeDTO;
import com.mgestionProduit.entites.Commande;

public interface ICommandeMapper {
	
	CommandeDTO convertToCommandeDto(Commande commande);
	Commande convertToCommande(CommandeDTO commandeDTO);

}
