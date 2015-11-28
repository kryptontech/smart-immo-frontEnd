package net.krypton.smartimmo.model;

import net.krypton.smartimmo.entities.SousCategorie;
import net.krypton.smartimmo.entities.TypeOffre;
import net.krypton.smartimmo.entities.Ville;

public class FormSearch {
	
	private TypeOffre to;
	private Ville ville;
	private SousCategorie sousCategorie;
	private double prixMini;
	private double prixMaxi;
	private String quartier;
	
	
	
	public TypeOffre getTo() {
		return to;
	}
	public void setTo(TypeOffre to) {
		this.to = to;
	}
	
	public String getQuartier() {
		return quartier;
	}
	public void setQuartier(String quartier) {
		this.quartier = quartier;
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
	
	
	public SousCategorie getSousCategorie() {
		return sousCategorie;
	}
	public void setSousCategorie(SousCategorie sousCategorie) {
		this.sousCategorie = sousCategorie;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	public FormSearch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
