package com.mgestionProduit.services;

import java.util.List;

import com.mgestionProduit.entites.Produit;



public interface IProduitService {
	
	public Produit saveProduit(Produit produit);
	
	public void deleteProduit(Long idProduit);
	
	public List<Produit> getProduits();
	
	public Produit getProduit(Long idProduit);
	

	
	

}
