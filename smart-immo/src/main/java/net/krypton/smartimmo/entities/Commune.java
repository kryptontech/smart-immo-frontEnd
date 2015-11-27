package net.krypton.smartimmo.entities;

import java.io.Serializable;

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
public class Commune implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2814284985799883086L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_commune")
	private int idCommune;
	private String libelleCommune;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_ville")
	private Ville ville;

	
	public Commune() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commune(String libelleCommune) {
		super();
		this.libelleCommune = libelleCommune;
	}
	public int getIdCommune() {
		return idCommune;
	}
	public void setIdCommune(int idCommune) {
		this.idCommune = idCommune;
	}
	public String getLibelleCommune() {
		return libelleCommune;
	}
	public void setLibelleCommune(String libelleCommune) {
		this.libelleCommune = libelleCommune;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
	
	
}
