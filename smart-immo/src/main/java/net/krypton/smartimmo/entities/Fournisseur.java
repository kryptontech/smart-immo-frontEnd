package net.krypton.smartimmo.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Fournisseur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7724795309401193790L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_fournisseur")
	private int idFournisseur;

	private String pseudoFournisseur;
	
	private String nomFournisseur;

	private String emailFournisseur;
	
	private String mdpFournisseur;
	
	private boolean statuFournisseur;
	
	
	private String telFixeFournisseur;
	
	private String telMobileFournisseur;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="id_admin")
	private Admin admin;
	

	public Fournisseur(String pseudoFournisseur, String nomFournisseur, String emailFournisseur, String mdpFournisseur,
			String telFixeFournisseur, String telMobileFournisseur) {
		super();
		this.pseudoFournisseur = pseudoFournisseur;
		this.nomFournisseur = nomFournisseur;
		this.emailFournisseur = emailFournisseur;
		this.mdpFournisseur = mdpFournisseur;
		this.telFixeFournisseur = telFixeFournisseur;
		this.telMobileFournisseur = telMobileFournisseur;
	}

	

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public int getIdFournisseur() {
		return idFournisseur;
	}



	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}



	public String getPseudoFournisseur() {
		return pseudoFournisseur;
	}



	public void setPseudoFournisseur(String pseudoFournisseur) {
		this.pseudoFournisseur = pseudoFournisseur;
	}



	public String getNomFournisseur() {
		return nomFournisseur;
	}



	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}



	public String getEmailFournisseur() {
		return emailFournisseur;
	}



	public void setEmailFournisseur(String emailFournisseur) {
		this.emailFournisseur = emailFournisseur;
	}



	public String getMdpFournisseur() {
		return mdpFournisseur;
	}



	public void setMdpFournisseur(String mdpFournisseur) {
		this.mdpFournisseur = mdpFournisseur;
	}



	public boolean isStatuFournisseur() {
		return statuFournisseur;
	}



	public void setStatuFournisseur(boolean statuFournisseur) {
		this.statuFournisseur = statuFournisseur;
	}



	public String getTelFixeFournisseur() {
		return telFixeFournisseur;
	}



	public void setTelFixeFournisseur(String telFixeFournisseur) {
		this.telFixeFournisseur = telFixeFournisseur;
	}



	public String getTelMobileFournisseur() {
		return telMobileFournisseur;
	}



	public void setTelMobileFournisseur(String telMobileFournisseur) {
		this.telMobileFournisseur = telMobileFournisseur;
	}



	@Override
	public String toString()
	{
		return getNomFournisseur();
	}
	
	

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	
}
