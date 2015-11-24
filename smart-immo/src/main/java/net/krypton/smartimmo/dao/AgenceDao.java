package net.krypton.smartimmo.dao;

import java.util.List;

import net.krypton.smartimmo.entities.Agence;

public interface AgenceDao {

	public Agence ajouterAgence(Agence a);
	public Agence modifierAgence(Agence m);
	public void supprimerAgence (int idAgence);
	public Agence consulterAgence(int idAgence);
	public List<Agence> consulterAgences();
}
