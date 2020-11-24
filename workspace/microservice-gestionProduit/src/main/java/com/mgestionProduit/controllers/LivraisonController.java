package com.mgestionProduit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgestionProduit.entites.Livraison;
import com.mgestionProduit.services.ILivraisonService;



@CrossOrigin
@RestController
public class LivraisonController {
	
	@Autowired
	ILivraisonService livraisonService;
	
	@PostMapping("/livraisons")
	public Livraison save(@RequestBody Livraison livraison) {
		return livraisonService.saveLivraison(livraison);
	}
	
	@DeleteMapping("/livraisons/{id}")
	public void deleteOneByID(@PathVariable("id") Long id) {
		livraisonService.deleteLivraison(id);
	}
	
	@GetMapping("/livraisons")
	public List<Livraison> findAll(){
		return livraisonService.getLivraisons();
	}
	
	@GetMapping("/livraisons/{id}")
	public Livraison findOne(@PathVariable("id") Long id) {
		return livraisonService.getLivraison(id);
		
	}
	@PutMapping("/livraisons/{id}")
	public Livraison updateLivraison(@RequestBody Livraison livraison , @PathVariable("id")Long id ) {
		Livraison currentLivraison = livraisonService.getLivraison(id);
		currentLivraison.setAdresse(livraison.getAdresse());
		currentLivraison.setCommandes(livraison.getCommandes());
		currentLivraison.setLivraisonDate(livraison.getLivraisonDate());;
		
		return livraisonService.saveLivraison(currentLivraison);
	}

}
