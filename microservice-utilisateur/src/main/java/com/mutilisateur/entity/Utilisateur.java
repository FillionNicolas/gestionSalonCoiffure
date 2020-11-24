package com.mutilisateur.entity;

import java.io.Serializable;
//utilisé l'import Date celui de java.util et non sql
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String loginUtilisateur;
	private String passwordUtilisateur;
	private Date dateNaissanceUtilisateur;
	private Long numeroTelephoneUtilisateur;
	private String villeUtilisateur;
	private String adresseUtilisateur;
	private Boolean roleUtilisateur;//0 = admin , 1 = utilisateur
	
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String loginUtilisateur,
			String passwordUtilisateur, Date dateNaissanceUtilisateur, Long numeroTelephoneUtilisateur,
			String villeUtilisateur, String adresseUtilisateur, Boolean roleUtilisateur) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.loginUtilisateur = loginUtilisateur;
		this.passwordUtilisateur = passwordUtilisateur;
		this.dateNaissanceUtilisateur = dateNaissanceUtilisateur;
		this.numeroTelephoneUtilisateur = numeroTelephoneUtilisateur;
		this.villeUtilisateur = villeUtilisateur;
		this.adresseUtilisateur = adresseUtilisateur;
		this.roleUtilisateur = roleUtilisateur;
	}
	
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	public String getLoginUtilisateur() {
		return loginUtilisateur;
	}
	public void setLoginUtilisateur(String loginUtilisateur) {
		this.loginUtilisateur = loginUtilisateur;
	}
	public String getPasswordUtilisateur() {
		return passwordUtilisateur;
	}
	public void setPasswordUtilisateur(String passwordUtilisateur) {
		this.passwordUtilisateur = passwordUtilisateur;
	}
	public Date getDateNaissanceUtilisateur() {
		return dateNaissanceUtilisateur;
	}
	public void setDateNaissanceUtilisateur(Date dateNaissanceUtilisateur) {
		this.dateNaissanceUtilisateur = dateNaissanceUtilisateur;
	}
	public Long getNumeroTelephoneUtilisateur() {
		return numeroTelephoneUtilisateur;
	}
	public void setNumeroTelephoneUtilisateur(Long numeroTelephoneUtilisateur) {
		this.numeroTelephoneUtilisateur = numeroTelephoneUtilisateur;
	}
	public String getVilleUtilisateur() {
		return villeUtilisateur;
	}
	public void setVilleUtilisateur(String villeUtilisateur) {
		this.villeUtilisateur = villeUtilisateur;
	}
	public String getAdresseUtilisateur() {
		return adresseUtilisateur;
	}
	public void setAdresseUtilisateur(String adresseUtilisateur) {
		this.adresseUtilisateur = adresseUtilisateur;
	}
	public Boolean getRoleUtilisateur() {
		return roleUtilisateur;
	}
	public void setRoleUtilisateur(Boolean roleUtilisateur) {
		this.roleUtilisateur = roleUtilisateur;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", loginUtilisateur=" + loginUtilisateur
				+ ", passwordUtilisateur=" + passwordUtilisateur + ", dateNaissanceUtilisateur="
				+ dateNaissanceUtilisateur + ", numeroTelephoneUtilisateur=" + numeroTelephoneUtilisateur
				+ ", villeUtilisateur=" + villeUtilisateur + ", adresseUtilisateur=" + adresseUtilisateur
				+ ", roleUtilisateur=" + roleUtilisateur + "]";
	}
	
	
}
