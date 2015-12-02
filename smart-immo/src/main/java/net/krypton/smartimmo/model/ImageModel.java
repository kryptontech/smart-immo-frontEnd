package net.krypton.smartimmo.model;

import java.util.Date;





public class ImageModel {
	
	
	
	
	private Date datePuBien;
	
	private String quartier;
	private double prix;
	private double superfie; 
	private int idBien;
	private String album;
	
	
	public int getIdBien() {
		return idBien;
	}
	public void setIdBien(int idBien) {
		this.idBien = idBien;
	}
	
	public Date getDatePuBien() {
		return datePuBien;
	}
	public void setDatePuBien(Date datePuBien) {
		this.datePuBien = datePuBien;
	}
	
	

	
	public String getQuartier() {
		return quartier;
	}
	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getSuperfie() {
		return superfie;
	}
	public void setSuperfie(double superfie) {
		this.superfie = superfie;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	

}
