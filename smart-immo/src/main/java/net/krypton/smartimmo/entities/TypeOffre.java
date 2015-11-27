package net.krypton.smartimmo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class TypeOffre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5931995778435854092L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_typeoffre")
	private int idTypeOffre;
	@NotEmpty
	private String libelleTypeOffre;

	public int getIdTypeOffre() {
		return idTypeOffre;
	}

	public void setIdTypeOffre(int idTypeOffre) {
		this.idTypeOffre = idTypeOffre;
	}

	public String getLibelleTypeOffre() {
		return libelleTypeOffre;
	}

	public void setLibelleTypeOffre(String libelleTypeOffre) {
		this.libelleTypeOffre = libelleTypeOffre;
	}

	public TypeOffre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeOffre(String libelleTypeOffre) {
		super();
		this.libelleTypeOffre = libelleTypeOffre;
	}

	@Override
	public String toString()
	{
		return getLibelleTypeOffre();
	}
}
