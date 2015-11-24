package net.krypton.smartimmo.model;

import net.krypton.smartimmo.entities.Admin;
import net.krypton.smartimmo.entities.Agence;
import net.krypton.smartimmo.entities.Album;
import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.entities.Categorie;
import net.krypton.smartimmo.entities.Client;
import net.krypton.smartimmo.entities.Commune;
import net.krypton.smartimmo.entities.Disponibilite;
import net.krypton.smartimmo.entities.Fournisseur;
import net.krypton.smartimmo.entities.Region;
import net.krypton.smartimmo.entities.SousCategorie;
import net.krypton.smartimmo.entities.TypeOffre;
import net.krypton.smartimmo.entities.User;
import net.krypton.smartimmo.entities.Ville;

public class SmartImmoForm {

	private Admin admin;
	private Agence agence;
	private Album album;
	private Bien bien;
	private Categorie categorie;
	
	private Client client;
	private Commune commune;
	private Disponibilite disponibilite;
	private Fournisseur fournisseur;
	private Region region;
	
	private SousCategorie sousCategorie;
	private TypeOffre typeOffre;
	private User user;
	private Ville ville;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	public Bien getBien() {
		return bien;
	}
	public void setBien(Bien bien) {
		this.bien = bien;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Commune getCommune() {
		return commune;
	}
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	public Disponibilite getDisponibilite() {
		return disponibilite;
	}
	public void setDisponibilite(Disponibilite disponibilite) {
		this.disponibilite = disponibilite;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public SousCategorie getSousCategorie() {
		return sousCategorie;
	}
	public void setSousCategorie(SousCategorie sousCategorie) {
		this.sousCategorie = sousCategorie;
	}
	public TypeOffre getTypeOffre() {
		return typeOffre;
	}
	public void setTypeOffre(TypeOffre typeOffre) {
		this.typeOffre = typeOffre;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
}
