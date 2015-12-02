package net.krypton.smartimmo.model;




public class FrontPage {

	
	private String idBien;
	
	private String idFour;
	


	


	public String getIdFour() {
		return idFour;
	}



	public void setIdFour(String idFour) {
		this.idFour = idFour;
	}



	private String titreBien;
	
	private double superficieBien;
	
	private double prixBien;
	
	private String quartierBien;
	
	
	private String descriptionBien;
	
	
	private int nbPieceBien;
	private boolean statutBien = false;

	
	
	
	private String Fournisseur;
	
	
	private String Ville;

	
	private String disponibilite;
	
	
	private String typeoffre;
	
	
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



	


	public String getFournisseur() {
		return Fournisseur;
	}



	public void setFournisseur(String fournisseur) {
		Fournisseur = fournisseur;
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
