package com.clientui.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;



public class LivraisonBean {
	
	private Long idLivraison;
	private Date livraisonDate;
	private String adresse;
	
	@OneToMany(mappedBy = "livraisonBean")
	private List<CommandeBean> commandes=new ArrayList<>();
	
	public LivraisonBean() {}

	public LivraisonBean(Long idLivraison, Date livraisonDate, String adresse, List<CommandeBean> commandes) {
		super();
		this.idLivraison = idLivraison;
		this.livraisonDate = livraisonDate;
		this.adresse = adresse;
		this.commandes = commandes;
	}



	public Long getIdLivraison() {
		return idLivraison;
	}

	public void setIdLivraison(Long idLivraison) {
		this.idLivraison = idLivraison;
	}

	public Date getLivraisonDate() {
		return livraisonDate;
	}

	public void setLivraisonDate(Date livraisonDate) {
		this.livraisonDate = livraisonDate;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}




	public List<CommandeBean> getCommandes() {
		return commandes;
	}



	public void setCommandes(List<CommandeBean> commandes) {
		this.commandes = commandes;
	}


	@Override
	public String toString() {
		return "Livraison [idLivraison=" + idLivraison + ", livraisonDate=" + livraisonDate + ", adresse=" + adresse
				+ ", commandes=" + commandes + "]";
	}


}
