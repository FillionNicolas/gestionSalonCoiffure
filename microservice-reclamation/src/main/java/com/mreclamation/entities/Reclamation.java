package com.mreclamation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reclamation implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReclamation;
	
	private String titre;
	private String description;
	private Long idUtilisateur;
	
	public Reclamation() {}
	
//	public Reclamation(String titre, String description) {
//		this.titre = titre;
//		this.description = description;
//	}
//	
//	public Reclamation(Long idReclamation, String titre, String description) {
//		super();
//		this.idReclamation = idReclamation;
//		this.titre = titre;
//		this.description = description;
//	}
	
	public Reclamation(Long idReclamation, String titre, String description, Long idUtilisateur) {
		super();
		this.idReclamation = idReclamation;
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
	
	public Long getIdReclamation() {
		return idReclamation;
	}

	public void setIdReclamation(Long idReclamation) {
		this.idReclamation = idReclamation;
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
		return "Reclamation [idReclamation=" + idReclamation + ", titre=" + titre + ", description=" + description
				+ "]";
	}	

}
