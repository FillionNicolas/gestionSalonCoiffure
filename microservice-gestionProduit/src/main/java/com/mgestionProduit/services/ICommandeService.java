package com.mgestionProduit.services;


import java.util.List;

import com.mgestionProduit.entites.Commande;

public interface ICommandeService {
	
	public Commande saveCommade(Commande commande);
	
	public void deleteCommande(Long idCommande);
	
	public List<Commande> getCommandes();
	
	public Commande getCommande(Long idCommande);
	
	

}


