package net.krypton.smartimmo.model;

import org.hibernate.validator.constraints.NotEmpty;

public class AlbumModel {

	private String idAlbum;
	
	@NotEmpty
	private String pathAlbum;

	@NotEmpty
	private String bien;
	
	private String exception;

	
	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(String idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getPathAlbum() {
		return pathAlbum;
	}

	public void setPathAlbum(String pathAlbum) {
		this.pathAlbum = pathAlbum;
	}

	public String getBien() {
		return bien;
	}

	public void setBien(String bien) {
		this.bien = bien;
	}

	public AlbumModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlbumModel(String pathAlbum, String bien) {
		super();
		this.pathAlbum = pathAlbum;
		this.bien = bien;
	}
	
	
}
