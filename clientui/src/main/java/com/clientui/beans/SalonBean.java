package com.clientui.beans;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



public class SalonBean {
	private Long idSalon;
	private String nomSalon;
	private String adresseSalon;
	private String phonenumber;

	@ManyToOne
	@JoinColumn(name="reservation_fk", referencedColumnName="idReservation")
	private ReservationBean reservation;

	public SalonBean(Long idSalon, String nomSalon, String adresseSalon, String phonenumber,
			ReservationBean reservation) {
		super();
		this.idSalon = idSalon;
		this.nomSalon = nomSalon;
		this.adresseSalon = adresseSalon;
		this.phonenumber = phonenumber;
		this.reservation = reservation;
	}

	public SalonBean() {
		super();
	}

	public Long getIdSalon() {
		return idSalon;
	}

	public void setIdSalon(Long idSalon) {
		this.idSalon = idSalon;
	}

	public String getNomSalon() {
		return nomSalon;
	}

	public void setNomSalon(String nomSalon) {
		this.nomSalon = nomSalon;
	}

	public String getAdresseSalon() {
		return adresseSalon;
	}

	public void setAdresseSalon(String adresseSalon) {
		this.adresseSalon = adresseSalon;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public ReservationBean getReservation() {
		return reservation;
	}

	public void setReservation(ReservationBean reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "SalonBean [idSalon=" + idSalon + ", nomSalon=" + nomSalon + ", adresseSalon=" + adresseSalon
				+ ", phonenumber=" + phonenumber + ", reservation=" + reservation + "]";
	} 
	
	

	
}
