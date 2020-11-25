package com.mreclamation.controller;

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

import com.mreclamation.DTO.AvisDTO;
import com.mreclamation.entities.Avis;
import com.mreclamation.mapper.IAvisMapper;
import com.mreclamation.service.IAvisService;

@CrossOrigin
@RestController
public class AvisController {
	
	@Autowired
	IAvisService avisService;
	@Autowired
	IAvisMapper avisMapper;
	
	@GetMapping("/avis")
	public List<AvisDTO> findAll(){
		return (List<AvisDTO>) avisService.findAllAvis().stream().map(e-> avisMapper.convertToAvisDTO(e))
				.collect(Collectors.toList());
	}
	
	@GetMapping("/avis/{idAvis}")
	public AvisDTO findOne(@PathVariable("idAvis") Long idAvis) {
		return avisMapper.convertToAvisDTO(avisService.findOneAvis(idAvis));
	}
	
	@PostMapping("/avis")
	public AvisDTO saveAvis(@RequestBody Avis avis) {
		return avisMapper.convertToAvisDTO(avisService.saveAvis(avis));
		
	}
	
	@DeleteMapping("/avis/{idAvis}")
	public void deleteAvis(@PathVariable("idAvis") Long idAvis) {
		avisService.deleteAvis(idAvis);
	}
	

	@PutMapping("/avis/{idAvis}")
	public AvisDTO updateAvis(@PathVariable("idAvis") Long idAvis, @RequestBody Avis avis) {
		Avis currentAvis = avisService.findOneAvis(idAvis);
		currentAvis.setTitre(avis.getTitre());
		currentAvis.setDescription(avis.getDescription());
		currentAvis.setIdUtilisateur(avis.getIdUtilisateur());
		return avisMapper.convertToAvisDTO(avisService.saveAvis(currentAvis));
	}

}
