package com.mgestionProduit.servicesImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgestionProduit.entites.Produit;
import com.mgestionProduit.repositories.IProduitRepository;
import com.mgestionProduit.services.IProduitService;



@Service
public class ProduitServiceImpl implements IProduitService{

	@Autowired
	public IProduitRepository produitRepository;
	
	@Override
	public Produit saveProduit(Produit produit) {
		return produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(Long idProduit) {
		produitRepository.deleteById(idProduit);
		
	}

	@Override
	public List<Produit> getProduits() {
		return produitRepository.findAll();
	}

	@Override
	public Produit getProduit(Long idProduit) {
		return produitRepository.findById(idProduit).get();
	}


}
