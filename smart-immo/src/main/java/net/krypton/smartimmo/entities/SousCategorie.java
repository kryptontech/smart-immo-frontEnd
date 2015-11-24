package net.krypton.smartimmo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class SousCategorie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -555106185190240525L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_souscategorie")
	private int idSousCat;
	private String libelleSousCat;

	@ManyToOne
	@JoinColumn(name = "id_categorie")
	private Categorie categorie;

	public int getIdSousCat() {
		return idSousCat;
	}

	public void setIdSousCat(int idSousCat) {
		this.idSousCat = idSousCat;
	}

	public String getLibelleSousCat() {
		return libelleSousCat;
	}

	public void setLibelleSousCat(String libelleSousCat) {
		this.libelleSousCat = libelleSousCat;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public SousCategorie(String libelleSousCat, Categorie categorie) {
		super();
		this.libelleSousCat = libelleSousCat;

		this.categorie = categorie;
	}

	public SousCategorie() {
		super();
		// TODO Auto-generated constructor stub
	}

}
