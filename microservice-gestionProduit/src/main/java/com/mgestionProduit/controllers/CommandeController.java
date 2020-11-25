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

import com.mgestionProduit.dto.CommandeDTO;
import com.mgestionProduit.entites.Commande;
import com.mgestionProduit.mapper.ICommandeMapper;
import com.mgestionProduit.services.ICommandeService;

@CrossOrigin
@RestController
public class CommandeController {
	
	@Autowired
	 ICommandeService commandeService;
	
	@Autowired
	ICommandeMapper commandeMapper;
	
	@GetMapping("/commandes")
	public List<CommandeDTO> findAll(){
		return (List<CommandeDTO>)commandeService.getCommandes().stream().map(e->commandeMapper.convertToCommandeDto(e))
					.collect(Collectors.toList());
	}
	
	@GetMapping("/commandes/{id}")
	public CommandeDTO findOne(@PathVariable("id") Long id) {
		return commandeMapper.convertToCommandeDto(
				commandeService.getCommande(id));
		
	}
	
	@PostMapping("/commandes")
	public CommandeDTO saveOrUpdate(@RequestBody Commande commande) {
		return commandeMapper.convertToCommandeDto(commandeService.saveCommade(commande));
	}
	
	@DeleteMapping("/commandes/{id}")
	public void deleteOneByID(@PathVariable("id") Long id) {
		commandeService.deleteCommande(id);
	}
	
	
	@PutMapping("/commandes/{id}")
	public CommandeDTO updateCommande(@RequestBody Commande commande , @PathVariable("id") Long id ) {
		Commande currentCommande = commandeService.getCommande(id);
		currentCommande.setDateAchat(commande.getDateAchat());
		currentCommande.setLivraison(commande.getLivraison());
		currentCommande.setPrix(commande.getPrix());
		currentCommande.setProduits(commande.getProduits());
		currentCommande.setIdUtilisateur(commande.getIdUtilisateur());
		
		return commandeMapper.convertToCommandeDto(commandeService.saveCommade(currentCommande));
	}


}
