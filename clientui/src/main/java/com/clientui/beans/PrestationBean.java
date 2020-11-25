package com.clientui.beans;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



public class PrestationBean {
	private Long idPrestation;
	private String nomPrestation;

	@ManyToOne
	@JoinColumn(name="reservation_fk", referencedColumnName="idReservation")
	private ReservationBean reservation;

	public PrestationBean(Long idPrestation, String nomPrestation, ReservationBean reservation) {
		super();
		this.idPrestation = idPrestation;
		this.nomPrestation = nomPrestation;
		this.reservation = reservation;
	}

	public PrestationBean() {
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

	public ReservationBean getReservation() {
		return reservation;
	}

	public void setReservation(ReservationBean reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "PrestationBean [idPrestation=" + idPrestation + ", nomPrestation=" + nomPrestation + ", reservation="
				+ reservation + "]";
	} 
	
	
}
