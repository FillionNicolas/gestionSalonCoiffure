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

import com.mgestion_rdv.dto.SalonDTO;
import com.mgestion_rdv.entity.Salon;
import com.mgestion_rdv.mapper.ISalonMapper;
import com.mgestion_rdv.service.SalonService;

@CrossOrigin
@RestController
public class SalonController {
	@Autowired
	SalonService salonService;
	
	@Autowired
	ISalonMapper salonMapper;
	

	@GetMapping("/salons")
	public List<SalonDTO> findAll(){
		return (List<SalonDTO>) salonService.findAllSalon().stream().map(e->salonMapper.convertToSalonDTO(e))
				.collect(Collectors.toList());
	}
	

	@GetMapping("/salons/{id}")
	public SalonDTO findOne(@PathVariable("id") Long idSalon) {
		return salonMapper.convertToSalonDTO(salonService.findOneSalon(idSalon));
	}
	
	@PostMapping("/salons")
	public SalonDTO  saveOrUpdate(@RequestBody Salon salon) {
		return salonMapper.convertToSalonDTO(salonService.saveSalon(salon));
	}
	
	@DeleteMapping("/salons/{id}")
	public void deleteOneByID(@PathVariable("id") Long idSalon) {
		salonService.deleteSalon(idSalon);
	}
	
	@PutMapping("/salons/{id}")
	public SalonDTO updateSalon(@RequestBody Salon salon, @PathVariable("id") Long idSalon) {
		Salon currentSalon = salonService.findOneSalon(idSalon);
		currentSalon.setIdSalon(salon.getIdSalon());
		currentSalon.setNomSalon(salon.getNomSalon());
		currentSalon.setAdresseSalon(salon.getAdresseSalon());
		currentSalon.setAdresseSalon(salon.getAdresseSalon());
		
		return salonMapper.convertToSalonDTO(salonService.saveSalon(currentSalon));
	}

}
