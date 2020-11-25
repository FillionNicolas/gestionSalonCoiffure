package com.mgestion_rdv.controller;

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

import com.mgestion_rdv.dto.PrestationDTO;
import com.mgestion_rdv.entity.Prestation;
import com.mgestion_rdv.mapper.IPrestationMapper;
import com.mgestion_rdv.service.PrestationService;

@CrossOrigin
@RestController
public class PrestationController {
	@Autowired
	PrestationService prestationService;
	
	@Autowired
	IPrestationMapper  prestationMapper;

	@GetMapping("/prestations")
	public List<PrestationDTO> findAll(){
		return (List<PrestationDTO>) prestationService.findAllPrestation().stream().map(e->prestationMapper.convertToPrestationDTO(e))
				.collect(Collectors.toList());
	}
	
	@GetMapping("/prestations/{id}")
	public PrestationDTO findOne(@PathVariable("id") Long idPrestation) {
		return prestationMapper.convertToPrestationDTO(prestationService.findOnePrestation(idPrestation));
		}
		
	@PostMapping("/prestations")
	public PrestationDTO  saveOrUpdate(@RequestBody Prestation prestation) {
		return prestationMapper.convertToPrestationDTO(prestationService.savePrestation(prestation));
	}
	
	@DeleteMapping("/prestations/{id}")
	public void deleteOneByID(@PathVariable("id") Long idPrestation) {
		prestationService.deletePrestation(idPrestation);
	}
	
	@PutMapping("/prestations/{id}")
	public PrestationDTO updatePrestation(@RequestBody Prestation prestation, @PathVariable("id") Long idPrestation) {
		Prestation currentPrestation = prestationService.findOnePrestation(idPrestation);
		currentPrestation.setIdPrestation(prestation.getIdPrestation());
		currentPrestation.setNomPrestation(prestation.getNomPrestation());
		return prestationMapper.convertToPrestationDTO(prestationService.savePrestation(currentPrestation));
	}
	

	
	
	
}

