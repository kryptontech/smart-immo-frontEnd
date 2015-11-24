package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Disponibilite;

public interface DisponibiliteDao {

	public Disponibilite ajouterDisponibilite(Disponibilite a);
	public Disponibilite modifierDisponibilite(Disponibilite m);
	public void supprimerDisponibilite (int idDisponibilite);
	public Disponibilite consulterDisponibilite(int idDisponibilite);
	public List<Disponibilite> consulterDisponibilites();
}
