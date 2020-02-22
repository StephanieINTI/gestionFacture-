package com.inti.entities;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idArticle;
	
	private String description;
	private int qteStock;
	private double prix;
	
	@OneToMany(mappedBy="article")
	private Set<LigneFacture> listLigneFacture = new TreeSet<LigneFacture>();

	public Article() {
		
	}
	
	


	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

    public int getQteStock() {
		return qteStock;
	}




	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}




	public double getPrix() {
		return prix;
	}




	public void setPrix(double prix) {
		this.prix = prix;
	}




	public Article(String description, int qteStock, double prix) {
		super();
		this.description = description;
		this.qteStock = qteStock;
		this.prix = prix;
	}




	public Set<LigneFacture> getListLigneFacture() {
		return listLigneFacture;
	}

	public void setListLigneFacture(Set<LigneFacture> listLigneFacture) {
		this.listLigneFacture = listLigneFacture;
	}

	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", description=" + description + ", qteStock=" + qteStock + ", prix="
				+ prix + "]";
	}
	
	

}
