package com.mgestion_rdv.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private Date dateReservation;
	private long idUtilisateur;
	
	@OneToMany(mappedBy = "reservation")
	private List<Prestation> prestations;
	
	@OneToMany(mappedBy = "reservation")
	private List<Salon> salons;


	public Reservation(Long idReservation, Date dateReservation, long idUtilisateur, List<Prestation> prestations,
			List<Salon> salons) {
		super();
		this.idReservation = idReservation;
		this.dateReservation = dateReservation;
		this.idUtilisateur = idUtilisateur;
		this.prestations = prestations;
		this.salons = salons;
	}

	public Reservation() {
		super();
	}
	
	public Reservation(Date dateReservation) {
		super();
		this.dateReservation = dateReservation;
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

	public long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateReservation=" + dateReservation + "]";
	}
	
	
	
}
