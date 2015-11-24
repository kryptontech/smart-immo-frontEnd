package net.krypton.smartimmo.entities;


import javax.persistence.Entity;

@Entity
public class Agence extends Fournisseur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4901531876191679728L;
	private String siteWebAgence;
	private String logoAgence;
	private String adresseAgence;
	
	
	public Agence(String pseudoFournisseur, String nomFournisseur, String emailFournisseur, String mdpFournisseur,
			String telFixeFournisseur, String telMobileFournisseur, String siteWebAgence, String logoAgence,
			String adresseAgence) {
		super(pseudoFournisseur, nomFournisseur, emailFournisseur, mdpFournisseur, telFixeFournisseur,
				telMobileFournisseur);
		this.siteWebAgence = siteWebAgence;
		this.logoAgence = logoAgence;
		this.adresseAgence = adresseAgence;
	}

	public String getSiteWebAgence() {
		return siteWebAgence;
	}

	public void setSiteWebAgence(String siteWebAgence) {
		this.siteWebAgence = siteWebAgence;
	}

	public String getLogoAgence() {
		return logoAgence;
	}

	public void setLogoAgence(String logoAgence) {
		this.logoAgence = logoAgence;
	}

	public String getAdresseAgence() {
		return adresseAgence;
	}

	public void setAdresseAgence(String adresseAgence) {
		this.adresseAgence = adresseAgence;
	}

	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
