package net.krypton.smartimmo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Bien implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3843757196622859693L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_bien")
	private int idBien;
	private String titreBien;
	private double superficieBien;
	private double prixBien;
	private String quartierBien;
	private String descriptionBien;
	private int nbPieceBien;
	private boolean statutBien;
	private Date datePubBien;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_fournisseur")
	private Fournisseur fournisseur;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Ville")
	private Ville Ville;

	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_disponibilite")
	private Disponibilite disponibilite;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_typeoffre")
	private TypeOffre typeoffre;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_souscategorie")
	private SousCategorie souscategorie;

	public int getIdBien() {
		return idBien;
	}

	public void setIdBien(int idBien) {
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

	public boolean getStatutBien() {
		return statutBien;
	}

	public void setStatutBien(boolean statutBien) {
		this.statutBien = statutBien;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}




	public Disponibilite getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(Disponibilite disponibilite) {
		this.disponibilite = disponibilite;
	}

	public TypeOffre getTypeoffre() {
		return typeoffre;
	}

	public void setTypeoffre(TypeOffre typeoffre) {
		this.typeoffre = typeoffre;
	}

	public SousCategorie getSouscategorie() {
		return souscategorie;
	}

	public void setSouscategorie(SousCategorie souscategorie) {
		this.souscategorie = souscategorie;
	}

	public Bien(String titreBien, double superficieBien, int prixBien, String quartierBien, String descriptionBien,
			int nbPieceBien, boolean statutBien, Date datePubBien) {
		super();
		this.titreBien = titreBien;
		this.superficieBien = superficieBien;
		this.prixBien = prixBien;
		this.quartierBien = quartierBien;
		this.descriptionBien = descriptionBien;
		this.nbPieceBien = nbPieceBien;
		this.statutBien = statutBien;
	}

	public Bien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDatePubBien() {
		return datePubBien;
	}

	public void setDatePubBien(Date datePubBien) {
		this.datePubBien = datePubBien;
	}
	

	public Ville getVille() {
		return Ville;
	}

	public void setVille(Ville ville) {
		Ville = ville;
	}
	
	@Override
	public String toString()
	{
		return getTitreBien();
	}
	
}
