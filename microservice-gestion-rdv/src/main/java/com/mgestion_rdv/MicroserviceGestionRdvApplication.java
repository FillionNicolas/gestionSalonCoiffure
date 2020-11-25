package com.mgestion_rdv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.mgestion_rdv.entity.Prestation;
import com.mgestion_rdv.entity.Reservation;
import com.mgestion_rdv.entity.Salon;
import com.mgestion_rdv.repository.PrestationRepository;
import com.mgestion_rdv.repository.ReservationRepository;
import com.mgestion_rdv.repository.SalonRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceGestionRdvApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceGestionRdvApplication.class, args);
	}
	
	//Commenté par TA
	/*
	@Bean
	CommandLineRunner start(ReservationRepository reservationRepository) throws ParseException {
		SimpleDateFormat formater = null;
		formater = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = formater.parse("10-12-2018");
		Date d2 = formater.parse("10-11-2018");
		Date d3 = formater.parse("10-10-2018");
		Date d4 = formater.parse("10-09-2018");
		Date d5 = formater.parse("10-08-2018");
		

		return (args) -> {
			Stream.of(new Reservation(d1), new Reservation(d2),
					 new Reservation(d3), new Reservation(d4),
					 new Reservation(d5)).forEach((v) -> {
						 reservationRepository.save(v);
			});
		};

	}
	*/
	
	
	
	
	
	
	
	/*@Bean
	CommandLineRunner start(PrestationRepository prestationRepository) {
		return (args) -> {
			Stream.of(new Prestation("couper"), new Prestation("couleur"),
					 new Prestation("Lissage"), new Prestation("nutition"),
					 new Prestation("éclaircissements")).forEach((v) -> {
						 prestationRepository.save(v);
			});
		};

	}
	@Bean
	CommandLineRunner start(SalonRepository salonRepository) {
		return (args) -> {
			Stream.of(new Salon("Salon Hair"), new Salon("Deploys"),
					 new Salon("Hair Cut"), new Salon("Beautiful Hair"),
					 new Salon("Emanuelle Hair Salon")).forEach((v) -> {
						 salonRepository.save(v);
			});
		};

	}*/
	

}
