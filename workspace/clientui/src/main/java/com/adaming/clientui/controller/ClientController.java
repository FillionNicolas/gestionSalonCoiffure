package com.adaming.clientui.controller;

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

import com.adaming.clientui.beans.CommandeBean;
import com.adaming.clientui.beans.LivraisonBean;
import com.adaming.clientui.beans.ProduitBean;
import com.adaming.clientui.proxies.MicroServiceProduitProxies;

@CrossOrigin
@RestController
public class ClientController {

	@Autowired
	private MicroServiceProduitProxies microServiceProduitProxies;

	@GetMapping("/produits")
	public List<ProduitBean> getProduits() {
		return microServiceProduitProxies.findAll();
		
	}
	@GetMapping("/commandes")
	public List<CommandeBean> getCommandes() {
		return microServiceProduitProxies.findAllCommande();
	}
	@GetMapping("/livraisons")
	public List<LivraisonBean> getLivraisons() {
		return microServiceProduitProxies.findAllLivraisons();
	}
	
	@GetMapping("/produits/{id}")
	public ProduitBean findProduit(@PathVariable("id") Long id) {
		return microServiceProduitProxies.findOne(id);
	}
	@GetMapping("/commandes/{id}")
	public CommandeBean findCommande(@PathVariable("id") Long id) {
		return microServiceProduitProxies.findOneCommande(id);
	}
	
	@GetMapping("/livraisons/{id}")
	public LivraisonBean findLivraison(@PathVariable("id") Long id) {
		return microServiceProduitProxies.findOneLivraisons(id);
	}
	
	@PostMapping("/livraisons")
	public LivraisonBean saveCommande(@RequestBody LivraisonBean livraison) {
		 return microServiceProduitProxies.saveLivraison(livraison);
			
	}
	@PostMapping("/produits")
	public ProduitBean saveProduit(@RequestBody ProduitBean produit) {
		 return microServiceProduitProxies.saveProduit(produit);
	}
	@PostMapping("/commandes")
	public CommandeBean saveCommande(@RequestBody CommandeBean commande) {
		 return microServiceProduitProxies.saveCommande(commande);
	}
	@PutMapping("/produits/{id}")
	public ProduitBean updateProduit(@PathVariable("id") long idProduit, @RequestBody ProduitBean produit) {
		ProduitBean currentProduit = microServiceProduitProxies.findOne(idProduit);
		currentProduit.setCommande(produit.getCommande());
		currentProduit.setNom(produit.getNom());
		currentProduit.setPrix(produit.getPrix());
		
		return microServiceProduitProxies.saveProduit(currentProduit);

	}
	@PutMapping("/commandes/{id}")
	public CommandeBean updateCommande(@PathVariable("id") long idCommande, @RequestBody CommandeBean commande) {
		CommandeBean currentCommande = microServiceProduitProxies.findOneCommande(idCommande);
		currentCommande.setDateAchat(commande.getDateAchat());
		currentCommande.setLivraison(commande.getLivraison());
		currentCommande.setPrix(commande.getPrix());
		currentCommande.setProduits(commande.getProduits());
		return microServiceProduitProxies.saveCommande(currentCommande);

	}
	
	@PutMapping("/livraisons/{id}")
	public LivraisonBean updateLivraison(@PathVariable("id") long idLivraison, @RequestBody LivraisonBean livraison) {
		LivraisonBean currentLivraison = microServiceProduitProxies.findOneLivraisons(idLivraison);
		currentLivraison.setAdresse(livraison.getAdresse());
		currentLivraison.setCommandes(livraison.getCommandes());
		currentLivraison.setLivraisonDate(livraison.getLivraisonDate());
		return microServiceProduitProxies.saveLivraison(currentLivraison);

	}
	
	@DeleteMapping("/produits/{id}")
	void deleteProduit(@PathVariable("id") Long id) {
		microServiceProduitProxies.deleteProduit(id);
		}
	@DeleteMapping("/commandes/{id}")
	void deleteCommande(@PathVariable("id") Long id) {
		microServiceProduitProxies.deleteCommande(id);
		}
	
	@DeleteMapping("/livraisons/{id}")
	void deleteLivraison(@PathVariable("id") Long id) {
		microServiceProduitProxies.deleteLivraison(id);
	
	}
	

}
