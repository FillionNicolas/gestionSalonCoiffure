package com.mreclamation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avis implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis;	
	private String titre;
	private String description;
	private Long idUtilisateur;

	public Avis() {}
	
//	public Avis(String titre, String description) {
//		this.titre = titre;
//		this.description = description;
//	}
//	
//	public Avis(Long idAvis, String titre, String description) {
//		super();
//		this.idAvis = idAvis;
//		this.titre = titre;
//		this.description = description;
//	}

	public Avis(Long idAvis, String titre, String description, Long idUtilisateur) {
		super();
		this.idAvis = idAvis;
		this.titre = titre;
		this.description = description;
		this.idUtilisateur = idUtilisateur;
	}
	
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", titre=" + titre + ", description=" + description + "]";
	}
	
	
	
	
}
