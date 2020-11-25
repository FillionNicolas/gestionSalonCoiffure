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

import com.clientui.beans.AvisBean;
import com.clientui.beans.ReclamationBean;

@FeignClient(name="microservice-reclamation")
@RibbonClient(name= "microservice-reclamation")
public interface MicroServiceReclamationProxies {
	
	//Reclamation
	
	@GetMapping(value="/reclamations")
	List<ReclamationBean> findAllReclamation();
	
	@GetMapping(value = "/reclamations/{id}")
	public ReclamationBean findOneReclamation(@PathVariable("id") Long id);
	
	@PostMapping(value="/reclamations")
	public ReclamationBean saveReclamation(@RequestBody ReclamationBean reclamation);
	
	@PutMapping(value="/reclamations/{id}")
	public ReclamationBean updateReclamation(@RequestBody ReclamationBean reclamation, @PathVariable("id") Long id);
	
	@DeleteMapping(value = "/reclamations/{id}")
	void deleteReclamation(@PathVariable("id") Long id);
	
	//Avis
	
	@GetMapping(value="/avis")
	List<AvisBean> findAllAvis();
	
	@GetMapping(value="/avis/{id}")
	public AvisBean findOneAvis(@PathVariable("id") Long id);
	
	@PostMapping(value="/avis")
	public AvisBean saveAvis(@RequestBody AvisBean avis);
	
	@PutMapping(value="/avis/{id}")
	public AvisBean updateAvis(@RequestBody AvisBean avis, @PathVariable("id") Long id);
	
	@DeleteMapping(value = "/avis/{id}")
	void deleteAvis(@PathVariable("id") Long id);

}
