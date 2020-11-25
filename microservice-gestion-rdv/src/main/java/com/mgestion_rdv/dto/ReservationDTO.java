package com.mgestion_rdv.dto;

import java.util.Date;
import java.util.List;

import com.mgestion_rdv.entity.Prestation;
import com.mgestion_rdv.entity.Salon;

public class ReservationDTO {
	private Long idReservation;
	private Date dateReservation;
	private long idUtilisateur;
	private List<Prestation> prestations;
	private List<Salon> salons;
	

	public ReservationDTO(Long idReservation, Date dateReservation, long idUtilisateur, List<Prestation> prestations,
			List<Salon> salons) {
		super();
		this.idReservation = idReservation;
		this.dateReservation = dateReservation;
		this.idUtilisateur = idUtilisateur;
		this.prestations = prestations;
		this.salons = salons;
	}
	public ReservationDTO() {
		super();
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public List<Prestation> getPrestations() {
		return prestations;
	}
	public void setPrestations(List<Prestation> prestations) {
		this.prestations = prestations;
	}
	public List<Salon> getSalons() {
		return salons;
	}
	public void setSalons(List<Salon> salons) {
		this.salons = salons;
	}
	@Override
	public String toString() {
		return "ReservationDTO [idReservation=" + idReservation + ", dateReservation=" + dateReservation
				+ ", prestations=" + prestations + ", salons=" + salons + "]";
	}
	
	
	
	
	
	
}
