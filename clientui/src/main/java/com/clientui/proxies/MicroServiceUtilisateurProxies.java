package com.clientui.proxies;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.UtilisateurBean;

@FeignClient(name="microservice-utilisateur")
@RibbonClient(name="microservice-utilisateur")
public interface MicroServiceUtilisateurProxies {
//2Get, 1Post, 1Put, 1Delete
	@GetMapping(value="/utilisateurs")
	List<UtilisateurBean> findAllUtilisateur();
	
	@GetMapping(value="/utilisateurs/{id}")
	public UtilisateurBean findOneUtilisateur(@PathVariable("id") Long id);
	
	@PostMapping(value="/utilisateurs")
	public UtilisateurBean saveUtilisateur(@RequestBody UtilisateurBean utilisateur);
	
	@PutMapping(value="/utilisateurs/{id}")
	public UtilisateurBean updateUtilisateur(@RequestBody UtilisateurBean utilisateur, @PathVariable("id") Long id);
	
	@DeleteMapping(value = "/utilisateurs/{id}")
	void deleteUtilisateur(@PathVariable("id") Long id);
	
}
