package com.mgestion_rdv.dto;

import com.mgestion_rdv.entity.Reservation;

public class PrestationDTO {
	private Long idPrestation;
	private String nomPrestation;
	
	private Reservation reservation;

	public PrestationDTO(Long idPrestation, String nomPrestation, Reservation reservation) {
		super();
		this.idPrestation = idPrestation;
		this.nomPrestation = nomPrestation;
		this.reservation = reservation;
	}

	public PrestationDTO() {
		super();
	}

	public Long getIdPrestation() {
		return idPrestation;
	}

	public void setIdPrestation(Long idPrestation) {
		this.idPrestation = idPrestation;
	}

	public String getNomPrestation() {
		return nomPrestation;
	}

	public void setNomPrestation(String nomPrestation) {
		this.nomPrestation = nomPrestation;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "PrestationDTO [idPrestation=" + idPrestation + ", nomPrestation=" + nomPrestation + ", reservation="
				+ reservation + "]";
	} 
	
	
	
	
}
