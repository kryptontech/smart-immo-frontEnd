package net.krypton.smartimmo.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class FrontPage {

	
	private String idBien;
	@NotEmpty
	@Size(min= 10)
	private String titreBien;
	@NotNull
	private double superficieBien;
	@NotNull
	private double prixBien;
	@NotEmpty
	private String quartierBien;
	@NotEmpty
	@Size(min=15)
	private String descriptionBien;
	
	@NotNull
	private int nbPieceBien;
	private boolean statutBien;

	private Date datePubBien;
	
	@NotEmpty
	private String fournisseur;
	
	@NotEmpty
	private String Ville;

	
	private String disponibilite;
	
	@NotEmpty
	private String typeoffre;
	
	@NotEmpty
	private String souscategorie;

	private String exception;
	
	

	public String getException() {
		return exception;
	}



	public void setException(String exception) {
		this.exception = exception;
	}



	public String getIdBien() {
		return idBien;
	}



	public void setIdBien(String idBien) {
		this.idBien = idBien;
	}



	public String getTitreBien() {
		return titreBien;
	}



	public void setTitreBien(String titreBien) {
		this.titreBien = titreBien;
	}



	public double getSuperficieBien() {
		return superficieBien;
	}



	public void setSuperficieBien(double superficieBien) {
		this.superficieBien = superficieBien;
	}



	public double getPrixBien() {
		return prixBien;
	}



	public void setPrixBien(double prixBien) {
		this.prixBien = prixBien;
	}



	public String getQuartierBien() {
		return quartierBien;
	}



	public void setQuartierBien(String quartierBien) {
		this.quartierBien = quartierBien;
	}



	public String getDescriptionBien() {
		return descriptionBien;
	}



	public void setDescriptionBien(String descriptionBien) {
		this.descriptionBien = descriptionBien;
	}



	public int getNbPieceBien() {
		return nbPieceBien;
	}



	public void setNbPieceBien(int nbPieceBien) {
		this.nbPieceBien = nbPieceBien;
	}



	public boolean isStatutBien() {
		return statutBien;
	}



	public void setStatutBien(boolean statutBien) {
		this.statutBien = statutBien;
	}



	public Date getDatePubBien() {
		return datePubBien;
	}



	public void setDatePubBien(Date datePubBien) {
		this.datePubBien = datePubBien;
	}



	public String getFournisseur() {
		return fournisseur;
	}



	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}



	public String getVille() {
		return Ville;
	}



	public void setVille(String ville) {
		Ville = ville;
	}



	public String getDisponibilite() {
		return disponibilite;
	}



	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}



	public String getTypeoffre() {
		return typeoffre;
	}



	public void setTypeoffre(String typeoffre) {
		this.typeoffre = typeoffre;
	}



	public String getSouscategorie() {
		return souscategorie;
	}



	public void setSouscategorie(String souscategorie) {
		this.souscategorie = souscategorie;
	}



	public FrontPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
