package com.clientui.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;

public class ReservationBean {
	private Long idReservation;
	private Date dateReservation;
	
	@OneToMany(mappedBy = "reservation")
	private List<PrestationBean> prestations;
	
	@OneToMany(mappedBy = "reservation")
	private List<SalonBean> salons;

	public ReservationBean(Long idReservation, Date dateReservation, List<PrestationBean> prestations,
			List<SalonBean> salons) {
		super();
		this.idReservation = idReservation;
		this.dateReservation = dateReservation;
		this.prestations = prestations;
		this.salons = salons;
	}

	public ReservationBean() {
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

	public List<PrestationBean> getPrestations() {
		return prestations;
	}

	public void setPrestations(List<PrestationBean> prestations) {
		this.prestations = prestations;
	}

	public List<SalonBean> getSalons() {
		return salons;
	}

	public void setSalons(List<SalonBean> salons) {
		this.salons = salons;
	}

	@Override
	public String toString() {
		return "ReservationBean [idReservation=" + idReservation + ", dateReservation=" + dateReservation
				+ ", prestations=" + prestations + ", salons=" + salons + "]";
	}
	
	

}
