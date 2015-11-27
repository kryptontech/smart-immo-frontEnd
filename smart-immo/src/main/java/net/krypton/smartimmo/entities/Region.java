package net.krypton.smartimmo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Region implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4747269883355020893L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_region")
	private int idRegion;
	@NotEmpty
	private String libelleRegion;

	public int getIdRegion() {
		return idRegion;
	}

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}

	public String getLibelleRegion() {
		return libelleRegion;
	}

	public void setLibelleRegion(String libelleRegion) {
		this.libelleRegion = libelleRegion;
	}

	public Region(String libelleRegion) {
		super();
		this.libelleRegion = libelleRegion;
	}

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return getLibelleRegion();
	}
}
