package net.krypton.smartimmo.model;


public class FormSearch {
	
	
	private String ville;
	private String sousCategorie;
	private double prixMini;
	private double prixMaxi;
	private String quartierBien;
	
	
	
	
	public String getQuartierBien() {
		return quartierBien;
	}
	public void setQuartierBien(String quartierBien) {
		this.quartierBien = quartierBien;
	}
	public double getPrixMini() {
		return prixMini;
	}
	public void setPrixMini(double prixMini) {
		this.prixMini = prixMini;
	}
	public double getPrixMaxi() {
		return prixMaxi;
	}
	public void setPrixMaxi(double prixMaxi) {
		this.prixMaxi = prixMaxi;
	}
	
	
	
	
	public String getSousCategorie() {
		return sousCategorie;
	}
	public void setSousCategorie(String sousCategorie) {
		this.sousCategorie = sousCategorie;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public FormSearch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
