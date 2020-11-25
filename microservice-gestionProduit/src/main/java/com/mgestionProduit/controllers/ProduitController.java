package com.mgestionProduit.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgestionProduit.dto.ProduitDTO;
import com.mgestionProduit.entites.Produit;
import com.mgestionProduit.mapper.IProduitMapper;
import com.mgestionProduit.services.IProduitService;



@CrossOrigin
@RestController
public class ProduitController {
	
	@Autowired
	IProduitMapper produitMapper;
	
	@Autowired
	IProduitService produitService;
	
	@GetMapping("/produits")
	public List<ProduitDTO> findAll(){
		return (List<ProduitDTO>)produitService.getProduits().stream().map(e->
		produitMapper.convertToProduitDTO(e)).collect(Collectors.toList());
				
	}
	
	@GetMapping("/produits/{id}")
	public ProduitDTO findOne(@PathVariable("id") Long id) {
		return produitMapper.convertToProduitDTO(produitService.getProduit(id));
		
	}
	
	@PostMapping("/produits")
	public ProduitDTO saveProduit(@RequestBody Produit produit) {
		return produitMapper.convertToProduitDTO(produitService.saveProduit(produit));
	}
	
	@PutMapping("/produits/{id}")
	public ProduitDTO updateProduit(@RequestBody Produit produit, @PathVariable("id")Long id ) {
		Produit currentProduit = produitService.getProduit(id);
		currentProduit.setNom(produit.getNom());
		currentProduit.setPrix(produit.getPrix());
		currentProduit.setCommande(produit.getCommande());
		return produitMapper.convertToProduitDTO(produitService.saveProduit(currentProduit));
	}
	
	@DeleteMapping("/produits/{id}")
	public void deleteProduit(@PathVariable("id") Long id) {
		produitService.deleteProduit(id);

	}
}
