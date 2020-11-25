package com.mgestionProduit.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mgestionProduit.entites.Livraison;
import com.mgestionProduit.entites.Produit;

public class CommandeDTO {
	
	private Long idCommande;

	private Date dateAchat;

	private float prix;
	
	private long idUtilisateur;
	
	private Livraison livraison;
	
	
	private List<Produit> produits=new ArrayList<>();
	
	public CommandeDTO() {}

	


	public CommandeDTO(Long idCommande, Date dateAchat, float prix, long idUtilisateur, Livraison livraison,
			List<Produit> produits) {
		super();
		this.idCommande = idCommande;
		this.dateAchat = dateAchat;
		this.prix = prix;
		this.idUtilisateur = idUtilisateur;
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




	public long getIdUtilisateur() {
		return idUtilisateur;
	}




	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}





	public String toString() {
		return "CommandeDTO [idCommande=" + idCommande + ", dateAchat=" + dateAchat + ", prix=" + prix
				+ ", idUtilisateur=" + idUtilisateur + ", livraison=" + livraison + ", produits=" + produits + "]";
	}



	


}
