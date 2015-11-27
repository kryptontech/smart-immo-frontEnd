package net.krypton.smartimmo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Disponibilite implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2907440867824670149L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_disponibilite")
	private int idDisponibilite;
	@NotEmpty
	private String libelleDisponibilite;

	
	public int getIdDisponibilite() {
		return idDisponibilite;
	}
	public void setIdDisponibilite(int idDisponibilite) {
		this.idDisponibilite = idDisponibilite;
	}
	public String getLibelleDisponibilite() {
		return libelleDisponibilite;
	}
	public void setLibelleDisponibilite(String libelleDisponibilite) {
		this.libelleDisponibilite = libelleDisponibilite;
	}
	
	public Disponibilite(String libelleDisponibilite) {
		super();
		this.libelleDisponibilite = libelleDisponibilite;
	}
	public Disponibilite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString()
	{
		return getLibelleDisponibilite();
	}
	
}
