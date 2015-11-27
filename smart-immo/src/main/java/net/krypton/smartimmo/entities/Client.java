package net.krypton.smartimmo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity

	
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6010383939928891796L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int idClient;
	private String nomClient;
	private String prenomClient;
	@NotEmpty
	private String mailClient;
	private String telClient;
	
	
	public Client(String nomClient, String prenomClient, String mailClient, String telClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.mailClient = mailClient;
		this.telClient = telClient;
	}


	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public String getMailClient() {
		return mailClient;
	}


	public void setMailClient(String mailClient) {
		this.mailClient = mailClient;
	}


	public String getTelClient() {
		return telClient;
	}


	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}


	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
