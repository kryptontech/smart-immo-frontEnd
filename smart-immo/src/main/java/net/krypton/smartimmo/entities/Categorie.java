package net.krypton.smartimmo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -716603978083884348L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_categorie")
	private int idCategorie;
	private String libelleCategorie;
	
	
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getLibelleCategorie() {
		return libelleCategorie;
	}
	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}

	public Categorie(String libelleCategorie) {
		super();
		this.libelleCategorie = libelleCategorie;
	
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
