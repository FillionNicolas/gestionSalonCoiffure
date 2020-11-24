package com.clientui.beans;

public class AvisBean {
	
	private Long idAvis;	
	private String titre;
	private String description;
	private Long idUtilisateur;
	
	public AvisBean() {
		
	}
	
	public AvisBean(Long idAvis, String titre, String description) {
		super();
		this.idAvis = idAvis;
		this.titre = titre;
		this.description = description;
	}
	
	
	public AvisBean(Long idAvis, String titre, String description, Long idUtilisateur) {
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

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", titre=" + titre + ", description=" + description + "]";
	}


}
