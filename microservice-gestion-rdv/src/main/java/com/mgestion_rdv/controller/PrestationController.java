package com.mgestion_rdv.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgestion_rdv.configurations.ApplicationPropertiesConfiguration;
import com.mgestion_rdv.entity.Prestation;
import com.mgestion_rdv.service.IPrestationService;

@CrossOrigin
@RestController
public class PrestationController {
	@Autowired
	IPrestationService prestationService;
	
	@Autowired
	ApplicationPropertiesConfiguration applicationPropertiesConfiguration;


	@GetMapping("/prestations")
	public List<Prestation> findAll() {
		List<Prestation> prestations=prestationService.findAll();
		List<Prestation> listeLimitee=prestations.subList(0, applicationPropertiesConfiguration.getLimitDePrestations());	
		return listeLimitee;
	}

	@GetMapping("/prestations/{idPrestation}")
	public Optional<Prestation> findOne(@PathParam("idPrestation")Long id) {
		return prestationService.findOne(id);
	}
	
	@PostMapping("/prestations")
	public Prestation savePrestation(@RequestBody Prestation prestation) {
		return prestationService.savePrestation(prestation);
	}
	
	@DeleteMapping("/prestations/{idPrestation}")
	public void deletePrestation(Prestation prestation) {
		prestationService.deletePrestation(prestation);
		
	}

}

