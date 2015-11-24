package net.krypton.smartimmo.service;

import java.util.List;

import net.krypton.smartimmo.entities.Disponibilite;

public interface DisponibiliteService {

	public Disponibilite ajouterDisponibilite(Disponibilite a);
	public Disponibilite modifierDisponibilite(Disponibilite m);
	public void supprimerDisponibilite (int idDisponibilite);
	public Disponibilite consulterDisponibilite(int idDisponibilite);
	public List<Disponibilite> consulterDisponibilites();
}
