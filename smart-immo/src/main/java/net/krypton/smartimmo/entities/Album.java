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
public class Album implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2201245398035259619L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_album")
	private int idAlbum;
	private String pathAlbum;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_bien")
	private Bien bien;
	
	public Album(String pathAlbum) {
		super();
		this.pathAlbum = pathAlbum;
	}
	public int getIdAlbum() {
		return idAlbum;
	}
	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}
	public String getPathAlbum() {
		return pathAlbum;
	}
	public void setPathAlbum(String pathAlbum) {
		this.pathAlbum = pathAlbum;
	}
	public Bien getBien() {
		return bien;
	}
	public void setBien(Bien bien) {
		this.bien = bien;
	}
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
