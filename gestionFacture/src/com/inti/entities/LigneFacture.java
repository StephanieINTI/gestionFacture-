package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneFacture {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLigneFacture;
	private int quantite;
	private float prix;
	
	@ManyToOne
	@JoinColumn(name="id_facture")
	private Facture facture;
	
	@ManyToOne
	@JoinColumn(name="id_article")
	private Article article;

	public LigneFacture() {
	
	}

	
	
	public LigneFacture(int quantite, float prix) {
		this.quantite = quantite;
		this.prix = prix;
	}



	public Long getIdLigneFacture() {
		return idLigneFacture;
	}

	public void setIdLigneFacture(Long idLigneFacture) {
		this.idLigneFacture = idLigneFacture;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "LigneFacture [idLigneFacture=" + idLigneFacture + ", quantite=" + quantite + ", prix=" + prix
				+ ", facture=" + facture + ", article=" + article + "]";
	}
	
	
}
