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
public class Ville implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7870024111044781082L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ville")
	private int idVille;
	private String libelleVille;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_region")
	private Region region;

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public String getLibelleVille() {
		return libelleVille;
	}

	public void setLibelleVille(String libelleVille) {
		this.libelleVille = libelleVille;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Ville(String libelleVille) {
		super();
		this.libelleVille = libelleVille;
	}

	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return getLibelleVille();
	}
}
