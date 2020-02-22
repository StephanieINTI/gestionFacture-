package com.inti.entities;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long numFacture;
    private Date dateCreation;
    private Date dateModification;
    private int quantite;
    private String article;
    
    public int getQuantite() {
		return quantite;
	}




	public Facture(Date dateCreation, Date dateModification, int quantite, String article) {
		super();
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.quantite = quantite;
		this.article = article;
	}




	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}




	public String getArticle() {
		return article;
	}




	public void setArticle(String article) {
		this.article = article;
	}


	@ManyToOne
    @JoinColumn(name="id_employe")
    private Employe employe;
    
    
    @OneToMany(mappedBy="facture")
    private Set<LigneFacture> listLigneFacture = new TreeSet<LigneFacture>();


	public Facture() {
		
	}

	
	

	public Long getNumFacture() {
		return numFacture;
	}


	public void setNumFacture(Long numFacture) {
		this.numFacture = numFacture;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public Date getDateModification() {
		return dateModification;
	}


	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}


	public Employe getEmploye() {
		return employe;
	}


	public void setEmploye(Employe employe) {
		this.employe = employe;
	}




	public Set<LigneFacture> getListLigneFacture() {
		return listLigneFacture;
	}


	public void setListLigneFacture(Set<LigneFacture> listLigneFacture) {
		this.listLigneFacture = listLigneFacture;
	}


	@Override
	public String toString() {
		return "Facture [numFacture=" + numFacture + ", dateCreation=" + dateCreation + ", dateModification="
				+ dateModification + ", employe=" + employe + "]";
	}
    
	
    
}
