package com.mgestion_rdv.dto;

import com.mgestion_rdv.entity.Reservation;

public class SalonDTO {
	private Long idSalon;
	private String nomSalon;
	private String adresseSalon;
	private String phonenumber;
	
	private Reservation reservation;

	public SalonDTO(Long idSalon, String nomSalon, String adresseSalon, String phonenumber, Reservation reservation) {
		super();
		this.idSalon = idSalon;
		this.nomSalon = nomSalon;
		this.adresseSalon = adresseSalon;
		this.phonenumber = phonenumber;
		this.reservation = reservation;
	}

	public SalonDTO() {
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

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "SalonDTO [idSalon=" + idSalon + ", nomSalon=" + nomSalon + ", adresseSalon=" + adresseSalon
				+ ", phonenumber=" + phonenumber + ", reservation=" + reservation + "]";
	} 
	
	
	
	
	
	
}
