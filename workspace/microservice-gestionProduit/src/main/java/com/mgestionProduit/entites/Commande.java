package com.mgestionProduit.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Commande implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idCommande;
	

	private Date dateAchat;

	private float prix;
	
	
	@ManyToOne
	private Livraison livraison;
	
	@OneToMany(mappedBy = "commande")
	private List<Produit> produits=new ArrayList<>();
	
	public Commande() {}

	

	public Commande(Long idCommande, Date dateAchat, float prix, Livraison livraison, List<Produit> produits) {
		super();
		this.idCommande = idCommande;
		this.dateAchat = dateAchat;
		this.prix = prix;
		this.livraison = livraison;
		this.produits = produits;
	}



	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}


	public Livraison getLivraison() {
		return livraison;
	}



	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}



	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateAchat=" + dateAchat + ", prix=" + prix + ", livraison="
				+ livraison + ", produits=" + produits + ", getIdCommande()=" + getIdCommande() + ", getDateAchat()="
				+ getDateAchat() + ", getPrix()=" + getPrix() + ", getLivraison()=" + getLivraison()
				+ ", getProduits()=" + getProduits() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}






	




	
}
