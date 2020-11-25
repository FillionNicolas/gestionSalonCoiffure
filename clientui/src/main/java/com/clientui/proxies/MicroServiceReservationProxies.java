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

import com.clientui.beans.PrestationBean;
import com.clientui.beans.ReservationBean;
import com.clientui.beans.SalonBean;

//@FeignClient(name="zuul-server")
@FeignClient(name="microservice-gestion-rdv")
@RibbonClient(name="microservice-gestion-rdv")
public interface MicroServiceReservationProxies {
	@GetMapping(value="/reservations")
    List<ReservationBean> findAllReservation();

	@GetMapping("/reservations/{id}")
	public ReservationBean findOneReservation(@PathVariable("id") Long id);

    @PostMapping("/reservations")
	public ReservationBean saveReservation(@RequestBody ReservationBean reservation);

    @PutMapping("/reservations/{id}")
  	public ReservationBean updateReservation(@RequestBody ReservationBean reservation, @PathVariable("id") Long id);

  	@DeleteMapping("/reservations/{id}")
  	void deleteReservation(@PathVariable("id") Long id);
  	
  	
  	
  	
  	@GetMapping(value="/prestations")
    List<PrestationBean> findAllPrestation();

	@GetMapping("/prestations/{id}")
	public PrestationBean findOnePrestation(@PathVariable("id") Long id);

    @PostMapping("/prestations")
	public PrestationBean savePrestation(@RequestBody PrestationBean prestation);

    @PutMapping("/prestations/{id}")
	public PrestationBean updatePrestation(@RequestBody PrestationBean prestation, @PathVariable("id") Long id);

	@DeleteMapping("/prestations/{id}")
	void deletePrestation(@PathVariable("id") Long id);
	
	
	
	@GetMapping(value="/salons")
    List<SalonBean> findAllSalon();

	@GetMapping("/salons/{id}")
	public SalonBean findOneSalon(@PathVariable("id") Long id);

    @PostMapping("/salons")
	public SalonBean saveSalon(@RequestBody SalonBean salon);

    @PutMapping("/salons/{id}")
	public SalonBean updateSalon(@RequestBody SalonBean salon, @PathVariable("id") Long id);

	@DeleteMapping("/salons/{id}")
	void deleteSalon(@PathVariable("id") Long id);

}
